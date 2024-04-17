package com.withings.wiscale2.sleep.ui.sleepscore;

import android.os.Parcelable;
import com.withings.user.core.models.User;
import com.withings.wiscale2.sleep.libc.SleepScoreRecalculator;
import com.withings.wiscale2.track.data.SleepScore;
import com.withings.wiscale2.track.data.SleepTrackData;
import com.withings.wiscale2.track.data.Track;
import java.util.ArrayList;
import java.util.Iterator;
import org.joda.time.DateTime;
/* compiled from: SleepMonthViewModel.kt */
/* loaded from: classes5.dex */
public final class q2 {

    /* renamed from: a  reason: collision with root package name */
    private final ei0.q f61201a;

    /* renamed from: b  reason: collision with root package name */
    private final a f61202b;

    /* renamed from: c  reason: collision with root package name */
    private final SleepScoreRecalculator f61203c;

    /* renamed from: d  reason: collision with root package name */
    private Integer f61204d;

    /* renamed from: e  reason: collision with root package name */
    private Integer f61205e;

    /* renamed from: f  reason: collision with root package name */
    private Integer f61206f;

    /* renamed from: g  reason: collision with root package name */
    private ArrayList<rs.e> f61207g;

    /* compiled from: SleepMonthViewModel.kt */
    /* loaded from: classes5.dex */
    public interface a {
        rs.f p0(Track track, DateTime dateTime);
    }

    public q2(ei0.q qVar, h2 datumBuilderDelegate, SleepScoreRecalculator sleepScoreRecalculator) {
        kotlin.jvm.internal.u.j(datumBuilderDelegate, "datumBuilderDelegate");
        this.f61201a = qVar;
        this.f61202b = datumBuilderDelegate;
        this.f61203c = sleepScoreRecalculator;
        this.f61207g = new ArrayList<>();
    }

    public final Integer a() {
        return this.f61204d;
    }

    public final ArrayList<rs.e> b() {
        return this.f61207g;
    }

    public final Integer c() {
        return this.f61205e;
    }

    public final Integer d() {
        return this.f61206f;
    }

    public final void e(User user, DateTime anyDayInMonth) {
        int i11;
        kotlin.jvm.internal.u.j(user, "user");
        kotlin.jvm.internal.u.j(anyDayInMonth, "anyDayInMonth");
        ArrayList arrayList = new ArrayList();
        int maximumValue = anyDayInMonth.dayOfMonth().getMaximumValue();
        if (1 <= maximumValue) {
            int i12 = 1;
            while (true) {
                DateTime withDayOfMonth = anyDayInMonth.withDayOfMonth(i12);
                long id2 = user.getId();
                kotlin.jvm.internal.u.g(withDayOfMonth);
                Track C = this.f61201a.C(id2, withDayOfMonth, this.f61203c);
                if (C != null && C.isInProgress()) {
                    C = null;
                }
                this.f61207g.add(this.f61202b.p0(C, withDayOfMonth));
                arrayList.add(C);
                if (i12 == maximumValue) {
                    break;
                }
                i12++;
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList G = kotlin.collections.x.G(arrayList);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = G.iterator();
        while (true) {
            i11 = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            Track track = (Track) next;
            if (track.getEndDate().getDayOfWeek() == 7 || track.getEndDate().getDayOfWeek() == 6) {
                i11 = 1;
            }
            if ((i11 ^ 1) != 0) {
                arrayList2.add(next);
            }
        }
        ArrayList G2 = kotlin.collections.x.G(arrayList);
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = G2.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            Track track2 = (Track) next2;
            if (track2.getEndDate().getDayOfWeek() == 7 || track2.getEndDate().getDayOfWeek() == 6) {
                arrayList3.add(next2);
            }
        }
        if (!arrayList2.isEmpty()) {
            Iterator it3 = arrayList2.iterator();
            int i13 = 0;
            while (it3.hasNext()) {
                Parcelable data = ((Track) it3.next()).getData();
                kotlin.jvm.internal.u.h(data, "null cannot be cast to non-null type com.withings.wiscale2.track.data.SleepTrackData");
                i13 += (int) ((SleepTrackData) data).getTotalSleep().getMillis();
            }
            this.f61205e = Integer.valueOf(i13 / arrayList2.size());
        }
        if (!arrayList3.isEmpty()) {
            Iterator it4 = arrayList3.iterator();
            int i14 = 0;
            while (it4.hasNext()) {
                Parcelable data2 = ((Track) it4.next()).getData();
                kotlin.jvm.internal.u.h(data2, "null cannot be cast to non-null type com.withings.wiscale2.track.data.SleepTrackData");
                i14 += (int) ((SleepTrackData) data2).getTotalSleep().getMillis();
            }
            this.f61206f = Integer.valueOf(i14 / arrayList3.size());
        }
        ArrayList G3 = kotlin.collections.x.G(arrayList);
        ArrayList arrayList4 = new ArrayList();
        Iterator it5 = G3.iterator();
        while (it5.hasNext()) {
            Object next3 = it5.next();
            if (((Track) next3).getSleepScore() != null) {
                arrayList4.add(next3);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it6 = arrayList4.iterator();
        while (it6.hasNext()) {
            SleepScore sleepScore = ((Track) it6.next()).getSleepScore();
            if (sleepScore != null) {
                arrayList5.add(sleepScore);
            }
        }
        if (!arrayList4.isEmpty()) {
            int size = arrayList4.size();
            Iterator it7 = arrayList5.iterator();
            int i15 = 0;
            while (it7.hasNext()) {
                i15 += ((SleepScore) it7.next()).getSleepScoreValue();
            }
            this.f61204d = Integer.valueOf(i15 / size);
            Iterator it8 = arrayList4.iterator();
            while (it8.hasNext()) {
                Parcelable data3 = ((Track) it8.next()).getData();
                kotlin.jvm.internal.u.h(data3, "null cannot be cast to non-null type com.withings.wiscale2.track.data.SleepTrackData");
                i11 += (int) ((SleepTrackData) data3).getTotalSleep().getMillis();
            }
            int i16 = i11 / size;
            ArrayList arrayList6 = new ArrayList(kotlin.collections.x.y(arrayList5, 10));
            Iterator it9 = arrayList5.iterator();
            while (it9.hasNext()) {
                arrayList6.add(Integer.valueOf(((SleepScore) it9.next()).getSleepScoreValue()));
            }
            Integer num = (Integer) kotlin.collections.x.Y(arrayList6);
        }
    }
}
