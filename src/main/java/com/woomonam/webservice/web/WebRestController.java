package com.woomonam.webservice.web;

import com.woomonam.webservice.domain.posts.PostsRepository;
import com.woomonam.webservice.dto.PostsSaveRequestDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebRestController {

    private PostsRepository postsRepository;

    @GetMapping("/hello")
    public  String hello() {
        return "HellowWorld";
    }

    @PostMapping("/posts")
    public void savePosts(@RequestBody PostsSaveRequestDto dto){
        postsRepository.save(dto.toEntity());
    }

}
