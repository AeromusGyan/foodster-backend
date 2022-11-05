package sciaku.com.foodster.foodster.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;
import sciaku.com.foodster.foodster.config.JwtUtils;
import sciaku.com.foodster.foodster.helper.UserNotFoundException;
import sciaku.com.foodster.foodster.model.JwtRequest;
import sciaku.com.foodster.foodster.model.JwtResponse;
import sciaku.com.foodster.foodster.model.Member;
import sciaku.com.foodster.foodster.services.impl.UserDetailsServiceImpl;

import java.security.Principal;

@RestController
@CrossOrigin("*")
public class AuthenticateController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserDetailsServiceImpl userDetailsService;

    @Autowired
    private JwtUtils jwtUtils;

//    generateToken

    @PostMapping("/token")
    public ResponseEntity<?> generateToken(@RequestBody JwtRequest jwtRequest) throws Exception {
        try {
            authenticate(jwtRequest.getUsername(), jwtRequest.getPassword());
        } catch (UserNotFoundException e) {
            e.printStackTrace();
            throw new Exception("User not found !!");
        }
        /////authenticate
        UserDetails userDetails = this.userDetailsService.loadUserByUsername(jwtRequest.getUsername());

        String token = this.jwtUtils.generateToken(userDetails);

        return ResponseEntity.ok(new JwtResponse(token));
    }

    private void authenticate(String username, String password) throws Exception {
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
        } catch (DisabledException e) {
            throw new Exception("USER DISABLED" + e.getMessage());
        } catch (BadCredentialsException e) {
            throw new Exception("Invalid credentials" + e.getMessage());
        }
    }

    //  returns the currnet user details
    @GetMapping("/current-user")
    public Member getCurrentMember(Principal principal) {
        return ((Member) this.userDetailsService.loadUserByUsername(principal.getName()));
    }
}