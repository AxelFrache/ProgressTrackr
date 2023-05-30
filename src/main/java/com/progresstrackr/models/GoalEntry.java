package com.progresstrackr.models;

import java.time.LocalDate;
import java.util.UUID;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

@Entity
@Table(name = "goal_entry")
public class GoalEntry {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "goalEntryId")
    private UUID goalEntryId;

    @Column(name = "goalEntryDate")
    private LocalDate goalEntryDate;

    @Column(name = "goalEntryStatus")
    private boolean goalEntryStatus;

    @ManyToOne
    @JoinColumn(name = "goalId")
    private Goal goal;

}
