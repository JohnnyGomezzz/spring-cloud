package ru.johnnygomezzz;

public class ProductPackageDto {
    private Long id;
    private String title;

    public ProductPackageDto() {
    }

    public ProductPackageDto(Long id, String title) {
        this.id = id;
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
