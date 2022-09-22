package com.project.crux.sse.domain.dto;

import com.project.crux.sse.domain.Notification;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class NotificationResponseDto {
    private Long id;
    private String content;
    private Boolean status;

    public static NotificationResponseDto from(Notification notification) {

        return NotificationResponseDto.builder()
                .id(notification.getId())
                .content(notification.getContent())
                .status(notification.getIsRead())
                .build();
    }
}
