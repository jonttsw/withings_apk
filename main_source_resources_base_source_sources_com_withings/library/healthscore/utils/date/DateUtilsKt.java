package com.withings.library.healthscore.utils.date;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.library.healthscore.models.internal.common.Measurement;
import ep0.a;
import ep0.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import kotlin.time.DurationUnit;
import kotlinx.datetime.DatePeriod;
import kotlinx.datetime.Instant;
import kotlinx.datetime.InstantKt;
import kotlinx.datetime.TimeZone;
/* compiled from: DateUtils.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0011\u0010\u0004\u001a\u00020\u0003*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0017\u0010\b\u001a\u00020\u0000*\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\u0002\u001a\u0011\u0010\t\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\t\u0010\u0002\u001a\u0019\u0010\f\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0011\u0010\u000e\u001a\u00020\u000b*\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0010\u001a\u00020\u000b*\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u000f\u001a+\u0010\u0016\u001a\u00020\u00152\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0003¢\u0006\u0004\b\u0016\u0010\u0017\"\u0017\u0010\u0018\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0017\u0010\u001c\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001b\"\u0015\u0010!\u001a\u00020\u0003*\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\""}, d2 = {"", "getWeekNumber", "(J)J", "", "getDay", "(J)I", "Lep0/a;", "inWholeWeek-LRDsOJo", "inWholeWeek", "inWholeMinute", "startDate", "", "getCoefFromDate", "(JJ)D", "getCoefSumForNumberOfWeek", "(I)D", "getCoefForWeek", "", "Lcom/withings/library/healthscore/models/internal/common/Measurement;", "listDate", "minimumAgeInDay", "", "areOldEnough", "(Ljava/util/List;JI)Z", "dayInMillis", "J", "getDayInMillis", "()J", "threeMonthInMillis", "getThreeMonthInMillis", "Lkotlinx/datetime/DatePeriod;", "getWeeks", "(Lkotlinx/datetime/DatePeriod;)I", ConstantsWs.RANGESTR_WEEKS, "HealthScore_release"}, k = 2, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class DateUtilsKt {
    private static final long dayInMillis;
    private static final long threeMonthInMillis;

    static {
        a.C0892a c0892a = a.f65838b;
        DurationUnit durationUnit = DurationUnit.f78027g;
        dayInMillis = a.i(c.j(1, durationUnit));
        threeMonthInMillis = a.i(c.j(84, durationUnit));
    }

    public static final boolean areOldEnough(List<? extends Measurement> listDate, long j5, int i11) {
        u.j(listDate, "listDate");
        Measurement measurement = (Measurement) x.K(listDate);
        if (measurement == null || (j5 - measurement.getDateInMillis()) / dayInMillis < i11) {
            return false;
        }
        return true;
    }

    public static final double getCoefForWeek(int i11) {
        return Math.pow(0.9d, i11);
    }

    public static final double getCoefFromDate(long j5, long j11) {
        return Math.pow(0.9d, ((int) ((j11 - j5) / dayInMillis)) / 7);
    }

    public static final double getCoefSumForNumberOfWeek(int i11) {
        if (i11 == 12) {
            i11--;
        }
        int i12 = i11 + 1;
        double d11 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        for (int i13 = 0; i13 < i12; i13++) {
            d11 += Math.pow(0.9d, i13);
        }
        return d11;
    }

    public static final int getDay(long j5) {
        Instant.Companion companion = Instant.Companion;
        return InstantKt.daysUntil(companion.fromEpochMilliseconds(0L), companion.fromEpochMilliseconds(j5), TimeZone.Companion.currentSystemDefault());
    }

    public static final long getDayInMillis() {
        return dayInMillis;
    }

    public static final long getThreeMonthInMillis() {
        return threeMonthInMillis;
    }

    public static final long getWeekNumber(long j5) {
        return (j5 + 345600000) / 604800000;
    }

    public static final int getWeeks(DatePeriod datePeriod) {
        u.j(datePeriod, "<this>");
        return (int) Math.floor(datePeriod.getDays() / 7.0d);
    }

    public static final long inWholeMinute(long j5) {
        return j5 / 60000;
    }

    /* renamed from: inWholeWeek-LRDsOJo  reason: not valid java name */
    public static final long m29inWholeWeekLRDsOJo(long j5) {
        a.C0892a c0892a = a.f65838b;
        return (long) Math.floor(a.q(j5, DurationUnit.f78027g) / 7.0d);
    }
}
