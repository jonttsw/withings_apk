package com.withings.wiscale2.activity.workout.recognition.model;
/* loaded from: classes4.dex */
public interface ClassifierRepository {
    void deleteByUserId(long j5);

    Classifier getByUserId(long j5);

    void save(Classifier classifier);
}
