package com.withings.wiscale2.activity.workout.recognition.model;

import com.withings.vasistas.model.Vasistas;
import com.withings.wiscale2.activity.workout.recognition.model.Classifier;
import com.withings.wiscale2.activity.workout.recognition.model.RecognitionAlgo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import org.joda.time.DateTime;
/* loaded from: classes4.dex */
public class RecognitionAlgo {
    private List<RecognizedWorkout> recognizedWorkouts;

    /* loaded from: classes4.dex */
    public static class RecognizedWorkout {
        private static final float THRESHOLD_FALSE_DETECTION_CYCLING = 0.8f;
        public int activityRecognitionVersion;
        public DateTime endTime;
        public DateTime startTime;
        public int subcategory;
        public int subcategoryIndex;
        public float[] subcategoryScores;

        public RecognizedWorkout(int i11, int i12, int i13, float[] fArr, int i14) {
            this.startTime = new DateTime(i11 * 1000);
            this.endTime = new DateTime(i12 * 1000);
            this.subcategoryIndex = i13;
            this.subcategoryScores = fArr;
            this.activityRecognitionVersion = i14;
        }

        public boolean ignoreFalseCyclingDetection(Classifier classifier) {
            if (this.subcategory != 6) {
                return false;
            }
            HashMap hashMap = new HashMap();
            try {
                for (int i11 : classifier.getSubcategories()) {
                    hashMap.put(Integer.valueOf(i11), Float.valueOf(this.subcategoryScores[this.subcategoryIndex]));
                }
                if (((Float) hashMap.getOrDefault(Integer.valueOf(this.subcategory), Float.valueOf(0.0f))).floatValue() >= THRESHOLD_FALSE_DETECTION_CYCLING) {
                    return false;
                }
                return true;
            } catch (Exception e11) {
                e11.printStackTrace();
                return true;
            }
        }

        public boolean shouldAutoConfirmWorkout() {
            int i11 = this.subcategory;
            if (i11 == 1 || i11 == 2 || i11 == 6) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$postProcessRecognizedWorkouts$0(Classifier classifier, RecognizedWorkout recognizedWorkout) {
        return !recognizedWorkout.ignoreFalseCyclingDetection(classifier);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$postProcessRecognizedWorkouts$1(Classifier classifier, RecognizedWorkout recognizedWorkout) {
        if (!classifier.shouldRecognizeAllActivities() && !recognizedWorkout.shouldAutoConfirmWorkout()) {
            return false;
        }
        return true;
    }

    private void onWorkoutRecognized(RecognizedWorkout recognizedWorkout) {
        this.recognizedWorkouts.add(recognizedWorkout);
    }

    private void postProcessRecognizedWorkouts(final Classifier classifier) {
        for (RecognizedWorkout recognizedWorkout : this.recognizedWorkouts) {
            recognizedWorkout.subcategory = classifier.getSubcategories()[recognizedWorkout.subcategoryIndex];
        }
        this.recognizedWorkouts = (List) this.recognizedWorkouts.stream().filter(new Predicate() { // from class: wa0.a
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean lambda$postProcessRecognizedWorkouts$0;
                lambda$postProcessRecognizedWorkouts$0 = RecognitionAlgo.lambda$postProcessRecognizedWorkouts$0(Classifier.this, (RecognitionAlgo.RecognizedWorkout) obj);
                return lambda$postProcessRecognizedWorkouts$0;
            }
        }).filter(new Predicate() { // from class: wa0.b
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean lambda$postProcessRecognizedWorkouts$1;
                lambda$postProcessRecognizedWorkouts$1 = RecognitionAlgo.lambda$postProcessRecognizedWorkouts$1(Classifier.this, (RecognitionAlgo.RecognizedWorkout) obj);
                return lambda$postProcessRecognizedWorkouts$1;
            }
        }).collect(Collectors.toList());
    }

    private native List<RecognizedWorkout> recognize(int i11, int[] iArr, int[] iArr2, int[] iArr3, float[] fArr, int[] iArr4, float[] fArr2, int i12, int[] iArr5, int[] iArr6, float[] fArr3, int[] iArr7, int[] iArr8, float[] fArr4, int[] iArr9, int[] iArr10, float[] fArr5, boolean z5);

    public native int getFormat();

    public native int getVersion();

    public List<RecognizedWorkout> recognizeWorkouts(List<Vasistas> list, Classifier classifier) {
        this.recognizedWorkouts = new ArrayList();
        int size = list.size();
        int[] iArr = new int[size];
        int[] iArr2 = new int[size];
        int[] iArr3 = new int[size];
        float[] fArr = new float[size];
        int[] iArr4 = new int[size];
        for (int i11 = 0; i11 < list.size(); i11++) {
            Vasistas vasistas = list.get(i11);
            iArr[i11] = (int) (vasistas.getStartDate().getMillis() / 1000);
            iArr2[i11] = vasistas.getSteps();
            iArr3[i11] = vasistas.getActivityType().getWsValue();
            fArr[i11] = vasistas.getClassifierFeature();
            iArr4[i11] = vasistas.getActivityRecognitionData2();
        }
        recognize(size, iArr, iArr2, iArr3, fArr, iArr4, null, classifier.getSubcategories().length, classifier.getCfeatNbins(), classifier.getCfeatIndices(), classifier.getCfeatValues(), classifier.getC2featNbins(), classifier.getC2featIndices(), classifier.getC2featValues(), classifier.getBasicNbins(), classifier.getBasicIndices(), classifier.getBasicValues(), false);
        postProcessRecognizedWorkouts(classifier);
        return this.recognizedWorkouts;
    }
}
