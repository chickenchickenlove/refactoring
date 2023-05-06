package me.whiteship.refactoring._13_loop._33_replace_loop_with_pipeline.after;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Author {

    private String company;

    private String twitterHandle;

    public Author(String company, String twitterHandle) {
        this.company = company;
        this.twitterHandle = twitterHandle;
    }

    static public List<String> TwitterHandles(List<Author> authors, String company) {
        // 아래 반복문을 파이프라인으로 바꾸기
        return authors.stream()
                .filter(author -> author.company.equals(company))
                .map(author -> author.twitterHandle)
                .filter(Objects::nonNull)
                .collect(Collectors.toList());

    }

}
