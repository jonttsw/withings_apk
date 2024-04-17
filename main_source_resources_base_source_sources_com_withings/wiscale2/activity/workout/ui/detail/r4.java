package com.withings.wiscale2.activity.workout.ui.detail;

import android.content.Context;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.huawei.hms.feature.dynamic.ModuleCopy;
import com.rudderstack.android.sdk.core.util.Utils;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.vasistas.model.Vasistas;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.activity.workout.ui.detail.s4;
import com.withings.wiscale2.track.data.Track;
import com.withings.wiscale2.track.data.TrackKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.internal.http2.Http2;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.Duration;
import rs.e;
import rs.h;
/* compiled from: WorkoutHeartRate.kt */
/* loaded from: classes4.dex */
public final class r4 {

    /* renamed from: a  reason: collision with root package name */
    private final int f49589a;

    public r4(Context context) {
        kotlin.jvm.internal.u.j(context, "context");
        this.f49589a = androidx.core.content.a.getColor(context, C1987R.color.statusUndefined);
    }

    public final q4 a(User user, Track workout, List<Vasistas> heartRates, List<Vasistas> pauseVasistas) {
        s4.a aVar;
        int i11;
        int i12;
        int i13;
        int[] P0;
        double d11;
        Object next;
        int i14;
        Object next2;
        int i15;
        Vasistas copy;
        kotlin.jvm.internal.u.j(user, "user");
        kotlin.jvm.internal.u.j(workout, "workout");
        kotlin.jvm.internal.u.j(heartRates, "heartRates");
        kotlin.jvm.internal.u.j(pauseVasistas, "pauseVasistas");
        List<Vasistas> list = heartRates;
        int i16 = 1;
        if (!list.isEmpty()) {
            ArrayList S0 = kotlin.collections.x.S0(list);
            int i17 = 10;
            ArrayList arrayList = new ArrayList(kotlin.collections.x.y(S0, 10));
            Iterator it = S0.iterator();
            while (it.hasNext()) {
                copy = r9.copy((r62 & 1) != 0 ? r9.startDate : null, (r62 & 2) != 0 ? r9.f46386id : null, (r62 & 4) != 0 ? r9.userId : null, (r62 & 8) != 0 ? r9.durationMillis : 0, (r62 & 16) != 0 ? r9.type : null, (r62 & 32) != 0 ? r9.activityType : null, (r62 & 64) != 0 ? r9.category : null, (r62 & 128) != 0 ? r9.calories : 0.0f, (r62 & 256) != 0 ? r9.earnedCalories : 0.0f, (r62 & 512) != 0 ? r9.met : 0.0f, (r62 & 1024) != 0 ? r9.sleepLevel : 0, (r62 & ModuleCopy.f28574b) != 0 ? r9.sleepDebug : 0, (r62 & 4096) != 0 ? r9.snoringDurationRatio : 0, (r62 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? r9.heartRate : 0, (r62 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? r9.heartRateMeasureQuality : 0, (r62 & Utils.MAX_EVENT_SIZE) != 0 ? r9.skinTemperature : 0, (r62 & 65536) != 0 ? r9.coreTemperature : 0.0f, (r62 & 131072) != 0 ? r9.activityStatus : 0, (r62 & 262144) != 0 ? r9.steps : 0, (r62 & 524288) != 0 ? r9.distance : 0.0f, (r62 & 1048576) != 0 ? r9.classifierFeature : 0.0f, (r62 & 2097152) != 0 ? r9.swimMovements : 0, (r62 & 4194304) != 0 ? r9.swimLaps : 0, (r62 & 8388608) != 0 ? r9.deviceModel : 0, (r62 & 16777216) != 0 ? r9.activityRecognitionData2 : 0, (r62 & 33554432) != 0 ? r9.version : 0, (r62 & 67108864) != 0 ? r9.swimType : 0, (r62 & 134217728) != 0 ? r9.deviceId : 0L, (r62 & 268435456) != 0 ? r9.apneaHypopneaIndex : null, (536870912 & r62) != 0 ? r9.breathingProbability : null, (r62 & ConstantsWs.DEBUG_BITMASK_EXTENDED_WPM04_RAWDATA_RESEARCH) != 0 ? r9.pauseType : null, (r62 & Integer.MIN_VALUE) != 0 ? r9.spo2 : null, (r63 & 1) != 0 ? r9.spo2Quality : null, (r63 & 2) != 0 ? r9.isSyncedToWs : false, (r63 & 4) != 0 ? r9.respiratoryRate : 0, (r63 & 8) != 0 ? r9.hrLevel : 0, (r63 & 16) != 0 ? r9.hrState : 0, (r63 & 32) != 0 ? r9.algoVersion : null, (r63 & 64) != 0 ? r9.firmwareVersion : null, (r63 & 128) != 0 ? r9.appPfmId : null, (r63 & 256) != 0 ? r9.appliVersion : null, (r63 & 512) != 0 ? r9.isTrusted : false, (r63 & 1024) != 0 ? ((Vasistas) it.next()).attrib : null);
                arrayList.add(copy);
            }
            Iterator it2 = arrayList.iterator();
            while (true) {
                i11 = 0;
                if (!it2.hasNext()) {
                    break;
                }
                Vasistas vasistas = (Vasistas) it2.next();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : pauseVasistas) {
                    if (androidx.activity.b0.o(vasistas.getEnd(), ((Vasistas) obj).getStartDate())) {
                        arrayList2.add(obj);
                    }
                }
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    i11 += ((Vasistas) it3.next()).getDurationMillis();
                }
                DateTime minusMillis = vasistas.getStartDate().minusMillis(i11);
                kotlin.jvm.internal.u.i(minusMillis, "minusMillis(...)");
                vasistas.setStartDate(minusMillis);
            }
            ArrayList<Vasistas> arrayList3 = new ArrayList();
            DateTime startDate = ((Vasistas) arrayList.get(0)).getStartDate();
            DateTime plus = TrackKt.getEffectiveStartDate(workout).plus(workout.getDuration());
            ArrayList d12 = ah.f.d(workout, pauseVasistas);
            kotlin.jvm.internal.u.g(plus);
            aVar = new s4.a(d12, plus, 1);
            Iterator it4 = arrayList.iterator();
            int i18 = 0;
            while (it4.hasNext()) {
                Object next3 = it4.next();
                int i19 = i18 + 1;
                if (i18 >= 0) {
                    Vasistas vasistas2 = (Vasistas) next3;
                    if (new Duration(startDate, vasistas2.getStartDate()).getMillis() <= 30000 && i18 != arrayList.size() - i16) {
                        i12 = i16;
                        i13 = i11;
                    } else {
                        if ((arrayList3.isEmpty() ^ i16) != 0) {
                            DateTime effectiveStartDate = TrackKt.getEffectiveStartDate(workout);
                            ArrayList arrayList4 = new ArrayList(kotlin.collections.x.y(arrayList3, i17));
                            for (Vasistas vasistas3 : arrayList3) {
                                arrayList4.add(Integer.valueOf(vasistas3.getHeartRate()));
                            }
                            int length = kotlin.collections.x.P0(arrayList4).length;
                            double d13 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                            int i21 = i11;
                            for (int i22 = i21; i22 < length; i22++) {
                                d13 += P0[i22];
                                i21++;
                            }
                            int i23 = i21;
                            if (i23 == 0) {
                                d11 = Double.NaN;
                            } else {
                                d11 = d13 / i23;
                            }
                            int i24 = (int) d11;
                            DateTime dateTime = new DateTime(startDate.minus(effectiveStartDate.getMillis()));
                            Iterator it5 = arrayList3.iterator();
                            if (!it5.hasNext()) {
                                next = null;
                            } else {
                                next = it5.next();
                                if (it5.hasNext()) {
                                    int heartRate = ((Vasistas) next).getHeartRate();
                                    do {
                                        Object next4 = it5.next();
                                        int heartRate2 = ((Vasistas) next4).getHeartRate();
                                        if (heartRate > heartRate2) {
                                            next = next4;
                                            heartRate = heartRate2;
                                        }
                                    } while (it5.hasNext());
                                }
                            }
                            Vasistas vasistas4 = (Vasistas) next;
                            if (vasistas4 != null) {
                                i14 = vasistas4.getHeartRate();
                            } else {
                                i14 = 0;
                            }
                            Iterator it6 = arrayList3.iterator();
                            if (!it6.hasNext()) {
                                next2 = null;
                            } else {
                                next2 = it6.next();
                                if (it6.hasNext()) {
                                    int heartRate3 = ((Vasistas) next2).getHeartRate();
                                    do {
                                        Object next5 = it6.next();
                                        int heartRate4 = ((Vasistas) next5).getHeartRate();
                                        if (heartRate3 < heartRate4) {
                                            next2 = next5;
                                            heartRate3 = heartRate4;
                                        }
                                    } while (it6.hasNext());
                                }
                            }
                            Vasistas vasistas5 = (Vasistas) next2;
                            if (vasistas5 != null) {
                                i15 = vasistas5.getHeartRate();
                            } else {
                                i15 = 0;
                            }
                            p4 p4Var = new p4(dateTime, i24, i14, i15);
                            float f11 = (float) DateTimeConstants.MILLIS_PER_MINUTE;
                            rs.e eVar = new rs.e(new e.a(((float) dateTime.getMillis()) / f11, i24));
                            eVar.f95625j = p4Var;
                            float millis = ((float) dateTime.getMillis()) / f11;
                            rs.e eVar2 = new rs.e(new e.a(millis, i14));
                            rs.e eVar3 = new rs.e(new e.a(millis, i15));
                            h.a aVar2 = new h.a(millis, 0.0f);
                            aVar2.h(eVar2, eVar3);
                            rs.h hVar = new rs.h(aVar2);
                            i12 = 1;
                            i11 = 0;
                            if (!arrayList3.isEmpty()) {
                                Vasistas vasistas6 = (Vasistas) arrayList3.get(0);
                                if (vasistas6.getStartDate().isAfter(workout.getEndDate()) || vasistas6.getStartDate().isBefore(workout.getStartDate())) {
                                    int i25 = this.f49589a;
                                    eVar.f95618c = i25;
                                    hVar.f95618c = ah.u.j(0.2f, i25);
                                    nm0.j jVar = new nm0.j(eVar, hVar);
                                    aVar.f66439a.add((rs.e) jVar.a());
                                    aVar.f66442d.add((rs.h) jVar.b());
                                }
                            }
                            nm0.j jVar2 = new nm0.j(eVar, hVar);
                            aVar.f66439a.add((rs.e) jVar2.a());
                            aVar.f66442d.add((rs.h) jVar2.b());
                        } else {
                            i12 = i16;
                        }
                        i13 = i11;
                        startDate = new DateTime((vasistas2.getStartDate().getMillis() / 30000) * 30000);
                        arrayList3 = new ArrayList();
                    }
                    arrayList3.add(vasistas2);
                    i18 = i19;
                    i16 = i12;
                    i11 = i13;
                    i17 = 10;
                } else {
                    kotlin.collections.x.K0();
                    throw null;
                }
            }
        } else {
            DateTime plus2 = TrackKt.getEffectiveStartDate(workout).plus(workout.getDuration());
            kotlin.jvm.internal.u.i(plus2, "plus(...)");
            aVar = new s4.a(null, plus2, 3);
        }
        return new q4(user, aVar, workout);
    }
}
