package com.ecom.user_service_api.api;

import com.ecom.user_service_api.service.SystemUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user-service/api/v1/users")
@RequiredArgsConstructor
public class SystemUserController {
    private final SystemUserService systemUserService;


}
