package com.withings.wiscale2.activity.workout.model;

import com.withings.vasistas.model.Vasistas;
import en0.l;
import en0.n;
import en0.r;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.q0;
import kotlin.collections.x;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
import org.joda.time.Interval;
/* compiled from: HeartRateVasistasCountChecker.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/activity/workout/model/HeartRateVasistasCountChecker;", "", "()V", "Companion", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HeartRateVasistasCountChecker {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final int HR_ACTIVITY_WINDOW_MILLIS = 30000;
    private static final int HR_ACTIVITY_WINDOW_SECONDS = 30;

    /* compiled from: HeartRateVasistasCountChecker.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0007J \u0010\u000e\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/withings/wiscale2/activity/workout/model/HeartRateVasistasCountChecker$Companion;", "", "()V", "HR_ACTIVITY_WINDOW_MILLIS", "", "HR_ACTIVITY_WINDOW_SECONDS", "checkIfEnoughVasistas", "", "vasistasList", "", "Lcom/withings/vasistas/model/Vasistas;", "start", "Lorg/joda/time/DateTime;", "end", "isWindowWithVasistas", "windowStart", "", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        private final boolean isWindowWithVasistas(List<Vasistas> list, long j5) {
            if (list != null) {
                for (Vasistas vasistas : list) {
                    if (new Interval(j5, 30000 + j5).contains(vasistas.getStartDate())) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }

        public final boolean checkIfEnoughVasistas(List<Vasistas> list, DateTime start, DateTime end) {
            int i11;
            u.j(start, "start");
            u.j(end, "end");
            l v11 = r.v(new n(start.getMillis(), end.getMillis()), 30000L);
            if ((v11 instanceof Collection) && ((Collection) v11).isEmpty()) {
                i11 = 0;
            } else {
                Iterator<Long> it = v11.iterator();
                i11 = 0;
                while (((en0.m) it).hasNext()) {
                    if (HeartRateVasistasCountChecker.Companion.isWindowWithVasistas(list, ((q0) it).a()) && (i11 = i11 + 1) < 0) {
                        x.J0();
                        throw null;
                    }
                }
            }
            if (i11 < (((end.getMillis() - start.getMillis()) / 1000) / 30) / 2) {
                return false;
            }
            return true;
        }

        private Companion() {
        }
    }

    public static final boolean checkIfEnoughVasistas(List<Vasistas> list, DateTime dateTime, DateTime dateTime2) {
        return Companion.checkIfEnoughVasistas(list, dateTime, dateTime2);
    }
}
