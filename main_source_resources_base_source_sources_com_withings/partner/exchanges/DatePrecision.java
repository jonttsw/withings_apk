package com.withings.partner.exchanges;

import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ExchangeData.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/partner/exchanges/DatePrecision;", "", "partner_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class DatePrecision {

    /* renamed from: a  reason: collision with root package name */
    public static final DatePrecision f43372a;

    /* renamed from: b  reason: collision with root package name */
    public static final DatePrecision f43373b;

    /* renamed from: c  reason: collision with root package name */
    private static final /* synthetic */ DatePrecision[] f43374c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.partner.exchanges.DatePrecision] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.partner.exchanges.DatePrecision] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.partner.exchanges.DatePrecision] */
    static {
        ?? r02 = new Enum("DAILY", 0);
        f43372a = r02;
        ?? r12 = new Enum("MILLIS", 1);
        ?? r22 = new Enum("SECONDS", 2);
        f43373b = r22;
        DatePrecision[] datePrecisionArr = {r02, r12, r22};
        f43374c = datePrecisionArr;
        b.a(datePrecisionArr);
    }

    private DatePrecision() {
        throw null;
    }

    public static DatePrecision valueOf(String str) {
        return (DatePrecision) Enum.valueOf(DatePrecision.class, str);
    }

    public static DatePrecision[] values() {
        return (DatePrecision[]) f43374c.clone();
    }
}
