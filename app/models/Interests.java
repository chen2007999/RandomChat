package models;

import play.db.ebean.*;

import java.lang.Long;
import java.util.*;
import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Id;
import java.lang.String;
import java.util.List;

@Entity
public class Interests extends Model {


    @Column(name = "interest")
    public String interest;

    @Column(name = "description")
    public String description;




}