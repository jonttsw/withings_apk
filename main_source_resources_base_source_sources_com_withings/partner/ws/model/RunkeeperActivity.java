package com.withings.partner.ws.model;

import com.google.gson.annotations.SerializedName;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.i0;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
/* compiled from: RunkeeperActivities.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 &2\u00020\u0001:\u0001&B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010$\u001a\u00020%H\u0016R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0006R\u0011\u0010\u0010\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\tR\u001a\u0010\u0012\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010\"\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b#\u0010\t¨\u0006'"}, d2 = {"Lcom/withings/partner/ws/model/RunkeeperActivity;", "", "()V", "calories", "", "getCalories", "()Ljava/lang/Integer;", "category", "getCategory", "()I", "setCategory", "(I)V", "date", "", "distanceInMeter", "getDistanceInMeter", "durationInSeconds", "getDurationInSeconds", "grpid", "getGrpid", "()J", "setGrpid", "(J)V", "measures", "", "Lcom/withings/partner/ws/model/RunkeeperMeasure;", "getMeasures", "()Ljava/util/List;", "setMeasures", "(Ljava/util/List;)V", "startDate", "Lorg/joda/time/DateTime;", "getStartDate", "()Lorg/joda/time/DateTime;", "subCategory", "getSubCategory", "toString", "", "Companion", "partner_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RunkeeperActivity {
    public static final Companion Companion = new Companion(null);
    public static final int MEASURE_TYPE_ACTIVITY_SUBCATEGORY = 42;
    public static final int MEASURE_TYPE_CALORIES = 52;
    public static final int MEASURE_TYPE_DISTANCE = 50;
    public static final int MEASURE_TYPE_DURATION = 51;
    private int category = -1;
    private long grpid = -1;
    private long date = -1;
    @SerializedName("measures")
    private List<RunkeeperMeasure> measures = i0.f76187a;

    /* compiled from: RunkeeperActivities.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/withings/partner/ws/model/RunkeeperActivity$Companion;", "", "()V", "MEASURE_TYPE_ACTIVITY_SUBCATEGORY", "", "MEASURE_TYPE_CALORIES", "MEASURE_TYPE_DISTANCE", "MEASURE_TYPE_DURATION", "partner_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        private Companion() {
        }
    }

    public final Integer getCalories() {
        Object obj;
        Iterator<T> it = this.measures.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((RunkeeperMeasure) obj).getType() == 52) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        RunkeeperMeasure runkeeperMeasure = (RunkeeperMeasure) obj;
        if (runkeeperMeasure == null) {
            return null;
        }
        return Integer.valueOf(runkeeperMeasure.getValue());
    }

    public final int getCategory() {
        return this.category;
    }

    public final Integer getDistanceInMeter() {
        Object obj;
        Iterator<T> it = this.measures.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((RunkeeperMeasure) obj).getType() == 50) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        RunkeeperMeasure runkeeperMeasure = (RunkeeperMeasure) obj;
        if (runkeeperMeasure == null) {
            return null;
        }
        Integer valueOf = Integer.valueOf(runkeeperMeasure.getValue());
        if (valueOf.intValue() <= 0) {
            valueOf = null;
        }
        if (valueOf == null) {
            return null;
        }
        return Integer.valueOf(valueOf.intValue() / 1000);
    }

    public final int getDurationInSeconds() {
        Object obj;
        Iterator<T> it = this.measures.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((RunkeeperMeasure) obj).getType() == 51) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        RunkeeperMeasure runkeeperMeasure = (RunkeeperMeasure) obj;
        if (runkeeperMeasure != null) {
            return runkeeperMeasure.getValue();
        }
        return 0;
    }

    public final long getGrpid() {
        return this.grpid;
    }

    public final List<RunkeeperMeasure> getMeasures() {
        return this.measures;
    }

    public final DateTime getStartDate() {
        return new DateTime(this.date * 1000);
    }

    public final int getSubCategory() {
        Object obj;
        Iterator<T> it = this.measures.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((RunkeeperMeasure) obj).getType() == 42) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        RunkeeperMeasure runkeeperMeasure = (RunkeeperMeasure) obj;
        if (runkeeperMeasure != null) {
            return runkeeperMeasure.getValue();
        }
        return 36;
    }

    public final void setCategory(int i11) {
        this.category = i11;
    }

    public final void setGrpid(long j5) {
        this.grpid = j5;
    }

    public final void setMeasures(List<RunkeeperMeasure> list) {
        u.j(list, "<set-?>");
        this.measures = list;
    }

    public String toString() {
        DateTime startDate = getStartDate();
        Integer distanceInMeter = getDistanceInMeter();
        int durationInSeconds = getDurationInSeconds();
        Integer calories = getCalories();
        int subCategory = getSubCategory();
        List<RunkeeperMeasure> list = this.measures;
        return "startDate " + startDate + " distanceInMeter " + distanceInMeter + " durationInSeconds " + durationInSeconds + " calories " + calories + " subCategory " + subCategory + " measures " + list;
    }
}
