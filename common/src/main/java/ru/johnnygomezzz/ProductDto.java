package ru.johnnygomezzz;

public class ProductDto {
    private Long id;
    private String title;

    public ProductDto() {
    }

    public ProductDto(Long id, String title) {
        this.id = id;
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
