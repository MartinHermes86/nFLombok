package co.github.martinhermes86;

import lombok.Builder;

@Builder
public record Teacher(
        int id,
        String name,
        String subject) {
}
