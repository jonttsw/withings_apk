package com.withings.wiscale2.activity.workout.model.temperature;

import com.google.android.gms.internal.mlkit_common.a;
import com.rudderstack.android.sdk.core.MessageType;
import com.withings.graph.model.NormalityZoneUiModel;
import com.withings.vasistas.model.Vasistas;
import com.withings.vasistas.v2.model.CoreTemperatureVasistas;
import com.withings.vasistas.ws.WsVasistasSerie;
import com.withings.wiscale2.track.data.Track;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
/* compiled from: WorkoutTemperatureGraphData.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u000eHÆ\u0003JY\u0010 \u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015¨\u0006("}, d2 = {"Lcom/withings/wiscale2/activity/workout/model/temperature/WorkoutTemperatureGraphData;", "", WsVasistasSerie.KEY_VASISTAS, "", "Lcom/withings/vasistas/v2/model/CoreTemperatureVasistas;", "pauseVasistas", "Lcom/withings/vasistas/model/Vasistas;", "initalDate", "Lorg/joda/time/DateTime;", MessageType.TRACK, "Lcom/withings/wiscale2/track/data/Track;", "normalityZones", "Lcom/withings/graph/model/NormalityZoneUiModel;", "baseline", "", "(Ljava/util/List;Ljava/util/List;Lorg/joda/time/DateTime;Lcom/withings/wiscale2/track/data/Track;Ljava/util/List;D)V", "getBaseline", "()D", "getInitalDate", "()Lorg/joda/time/DateTime;", "getNormalityZones", "()Ljava/util/List;", "getPauseVasistas", "getTrack", "()Lcom/withings/wiscale2/track/data/Track;", "getVasistas", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WorkoutTemperatureGraphData {
    public static final int $stable = 8;
    private final double baseline;
    private final DateTime initalDate;
    private final List<NormalityZoneUiModel> normalityZones;
    private final List<Vasistas> pauseVasistas;
    private final Track track;
    private final List<CoreTemperatureVasistas> vasistas;

    public WorkoutTemperatureGraphData(List<CoreTemperatureVasistas> vasistas, List<Vasistas> pauseVasistas, DateTime initalDate, Track track, List<NormalityZoneUiModel> normalityZones, double d11) {
        u.j(vasistas, "vasistas");
        u.j(pauseVasistas, "pauseVasistas");
        u.j(initalDate, "initalDate");
        u.j(normalityZones, "normalityZones");
        this.vasistas = vasistas;
        this.pauseVasistas = pauseVasistas;
        this.initalDate = initalDate;
        this.track = track;
        this.normalityZones = normalityZones;
        this.baseline = d11;
    }

    public static /* synthetic */ WorkoutTemperatureGraphData copy$default(WorkoutTemperatureGraphData workoutTemperatureGraphData, List list, List list2, DateTime dateTime, Track track, List list3, double d11, int i11, Object obj) {
        List<CoreTemperatureVasistas> list4 = list;
        if ((i11 & 1) != 0) {
            list4 = workoutTemperatureGraphData.vasistas;
        }
        List<Vasistas> list5 = list2;
        if ((i11 & 2) != 0) {
            list5 = workoutTemperatureGraphData.pauseVasistas;
        }
        List list6 = list5;
        if ((i11 & 4) != 0) {
            dateTime = workoutTemperatureGraphData.initalDate;
        }
        DateTime dateTime2 = dateTime;
        if ((i11 & 8) != 0) {
            track = workoutTemperatureGraphData.track;
        }
        Track track2 = track;
        List<NormalityZoneUiModel> list7 = list3;
        if ((i11 & 16) != 0) {
            list7 = workoutTemperatureGraphData.normalityZones;
        }
        List list8 = list7;
        if ((i11 & 32) != 0) {
            d11 = workoutTemperatureGraphData.baseline;
        }
        return workoutTemperatureGraphData.copy(list4, list6, dateTime2, track2, list8, d11);
    }

    public final List<CoreTemperatureVasistas> component1() {
        return this.vasistas;
    }

    public final List<Vasistas> component2() {
        return this.pauseVasistas;
    }

    public final DateTime component3() {
        return this.initalDate;
    }

    public final Track component4() {
        return this.track;
    }

    public final List<NormalityZoneUiModel> component5() {
        return this.normalityZones;
    }

    public final double component6() {
        return this.baseline;
    }

    public final WorkoutTemperatureGraphData copy(List<CoreTemperatureVasistas> vasistas, List<Vasistas> pauseVasistas, DateTime initalDate, Track track, List<NormalityZoneUiModel> normalityZones, double d11) {
        u.j(vasistas, "vasistas");
        u.j(pauseVasistas, "pauseVasistas");
        u.j(initalDate, "initalDate");
        u.j(normalityZones, "normalityZones");
        return new WorkoutTemperatureGraphData(vasistas, pauseVasistas, initalDate, track, normalityZones, d11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WorkoutTemperatureGraphData)) {
            return false;
        }
        WorkoutTemperatureGraphData workoutTemperatureGraphData = (WorkoutTemperatureGraphData) obj;
        if (u.e(this.vasistas, workoutTemperatureGraphData.vasistas) && u.e(this.pauseVasistas, workoutTemperatureGraphData.pauseVasistas) && u.e(this.initalDate, workoutTemperatureGraphData.initalDate) && u.e(this.track, workoutTemperatureGraphData.track) && u.e(this.normalityZones, workoutTemperatureGraphData.normalityZones) && Double.compare(this.baseline, workoutTemperatureGraphData.baseline) == 0) {
            return true;
        }
        return false;
    }

    public final double getBaseline() {
        return this.baseline;
    }

    public final DateTime getInitalDate() {
        return this.initalDate;
    }

    public final List<NormalityZoneUiModel> getNormalityZones() {
        return this.normalityZones;
    }

    public final List<Vasistas> getPauseVasistas() {
        return this.pauseVasistas;
    }

    public final Track getTrack() {
        return this.track;
    }

    public final List<CoreTemperatureVasistas> getVasistas() {
        return this.vasistas;
    }

    public int hashCode() {
        int hashCode;
        int b10 = a.b(this.initalDate, e.b(this.pauseVasistas, this.vasistas.hashCode() * 31, 31), 31);
        Track track = this.track;
        if (track == null) {
            hashCode = 0;
        } else {
            hashCode = track.hashCode();
        }
        return Double.hashCode(this.baseline) + e.b(this.normalityZones, (b10 + hashCode) * 31, 31);
    }

    public String toString() {
        List<CoreTemperatureVasistas> list = this.vasistas;
        List<Vasistas> list2 = this.pauseVasistas;
        DateTime dateTime = this.initalDate;
        Track track = this.track;
        List<NormalityZoneUiModel> list3 = this.normalityZones;
        double d11 = this.baseline;
        return "WorkoutTemperatureGraphData(vasistas=" + list + ", pauseVasistas=" + list2 + ", initalDate=" + dateTime + ", track=" + track + ", normalityZones=" + list3 + ", baseline=" + d11 + ")";
    }
}
