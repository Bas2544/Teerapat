package nvc.bcit.icefactory.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.yaml.snakeyaml.events.Event;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter @Setter @NoArgsConstructor
public class Camera {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String location;

    @ManyToOne
    @JoinColumn(name = "factoryId", nullable = false)
    private Factory factorys;

    @OneToMany(mappedBy = "camera")
    private List<Event> events;




}
