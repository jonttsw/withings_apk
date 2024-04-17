package com.withings.wiscale2.activity.workout.recognition.model;

import android.content.Context;
import com.withings.wiscale2.activity.workout.recognition.database.PrefClassifierRepository;
/* loaded from: classes4.dex */
public class RecognitionManager {
    private ClassifierRepository classifierRepository;

    public RecognitionManager(ClassifierRepository classifierRepository) {
        this.classifierRepository = classifierRepository;
    }

    public static RecognitionManager get(Context context) {
        return new RecognitionManager(new PrefClassifierRepository(context));
    }

    public int getAlgoFormat() {
        return new RecognitionAlgo().getFormat();
    }

    public int getAlgoVersion() {
        return new RecognitionAlgo().getVersion();
    }

    public Classifier getClassifierForUserId(long j5) {
        return this.classifierRepository.getByUserId(j5);
    }

    public void removeClassifierForUserId(long j5) {
        this.classifierRepository.deleteByUserId(j5);
    }

    public void saveClassifier(Classifier classifier) {
        this.classifierRepository.save(classifier);
    }
}
