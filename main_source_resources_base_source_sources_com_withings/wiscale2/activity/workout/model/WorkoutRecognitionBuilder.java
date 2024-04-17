package com.withings.wiscale2.activity.workout.model;

import com.withings.user.User;
import com.withings.vasistas.model.Vasistas;
import com.withings.vasistas.model.VasistasKt;
import com.withings.wiscale2.activity.workout.recognition.model.Classifier;
import com.withings.wiscale2.activity.workout.recognition.model.RecognitionAlgo;
import com.withings.wiscale2.track.data.Track;
import com.withings.workout.workoutdata.StepWorkoutData;
import com.withings.workout.workoutdata.SwimWorkoutData;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
/* loaded from: classes4.dex */
public class WorkoutRecognitionBuilder {
    private com.withings.device.details.automatic.activity.detection.d actirecCategoryDetectionRepository;
    private TimeZoneProvider timeZoneProvider;
    private WorkoutDataBuilder workoutDataBuilder;

    /* loaded from: classes4.dex */
    public interface TimeZoneProvider {
        DateTimeZone getTimezoneForUserAtDate(WorkoutRecognitionBuilder workoutRecognitionBuilder, long j5, DateTime dateTime);
    }

    public WorkoutRecognitionBuilder(TimeZoneProvider timeZoneProvider, WorkoutDataBuilder workoutDataBuilder, com.withings.device.details.automatic.activity.detection.d dVar) {
        this.timeZoneProvider = timeZoneProvider;
        this.workoutDataBuilder = workoutDataBuilder;
        this.actirecCategoryDetectionRepository = dVar;
    }

    private Track buildTrack(RecognitionAlgo.RecognizedWorkout recognizedWorkout, List<Vasistas> list, long j5) {
        Track track = new Track();
        track.setUserId(j5);
        track.setStartDate(recognizedWorkout.startTime);
        track.setEndDate(recognizedWorkout.endTime);
        track.setCategory(recognizedWorkout.subcategory);
        track.setActivityRecognitionVersion(Integer.valueOf(recognizedWorkout.activityRecognitionVersion));
        track.setAttrib(0);
        track.setTimeZone(this.timeZoneProvider.getTimezoneForUserAtDate(this, j5, track.getStartDate()));
        track.setDay(track.getStartDate().withZone(track.getDateTimeZone()).toString("yyyy-MM-dd"));
        track.setDeviceType(16);
        if (recognizedWorkout.subcategory == 7) {
            track.setData(new SwimWorkoutData());
        } else {
            track.setData(new StepWorkoutData());
        }
        track.setData(this.workoutDataBuilder.buildWorkoutData(track));
        track.setDeviceModel(getDeviceModel(list));
        Integer mostCountedDeviceId = VasistasKt.getMostCountedDeviceId(list);
        if (mostCountedDeviceId != null && mostCountedDeviceId.intValue() != 0) {
            track.setDeviceId(mostCountedDeviceId);
        }
        return track;
    }

    private int getDeviceModel(List<Vasistas> list) {
        lj0.e eVar = new lj0.e();
        for (Vasistas vasistas : list) {
            eVar.a(vasistas.getDeviceModel(), 1);
        }
        return eVar.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$buildWorkoutByRecognition$0(Map map, RecognitionAlgo.RecognizedWorkout recognizedWorkout) {
        return ((Boolean) map.getOrDefault(Long.valueOf(recognizedWorkout.subcategory), Boolean.TRUE)).booleanValue();
    }

    public List<Track> buildWorkoutByRecognition(List<Vasistas> list, User user, Classifier classifier) {
        ArrayList arrayList = new ArrayList();
        RecognitionAlgo recognitionAlgo = new RecognitionAlgo();
        final Map<Long, Boolean> d11 = this.actirecCategoryDetectionRepository.d(user.q());
        for (RecognitionAlgo.RecognizedWorkout recognizedWorkout : (List) recognitionAlgo.recognizeWorkouts(list, classifier).stream().filter(new Predicate() { // from class: com.withings.wiscale2.activity.workout.model.e
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean lambda$buildWorkoutByRecognition$0;
                lambda$buildWorkoutByRecognition$0 = WorkoutRecognitionBuilder.lambda$buildWorkoutByRecognition$0(d11, (RecognitionAlgo.RecognizedWorkout) obj);
                return lambda$buildWorkoutByRecognition$0;
            }
        }).collect(Collectors.toList())) {
            arrayList.add(buildTrack(recognizedWorkout, list, user.q()));
        }
        return arrayList;
    }
}
