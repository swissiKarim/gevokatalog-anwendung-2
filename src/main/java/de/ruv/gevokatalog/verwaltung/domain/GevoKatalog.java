package de.ruv.gevokatalog.verwaltung.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AllArgsConstructor;
import java.util.Set;

@Entity
@Table(name = "gevo_katalog")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GevoKatalog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(max = 100)
    private String fachbereich;

    private String fachlicheBeschreibung;

    @NotNull
    @Size(max = 30)
    private String version;
@OneToMany(mappedBy = "gevoKatalog", cascade = CascadeType.ALL, orphanRemoval = true)
private Set<FachlichePrompt> fachlichePrompts = new java.util.HashSet<>();

}
