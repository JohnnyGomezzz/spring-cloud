package ru.johnnygomezzz;

public class ProductPackage {
    private Long id;
    private String title;

    public ProductPackage(Long id, String title) {
        this.id = id;
        this.title = title;
    }

    public ProductPackage() {
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
