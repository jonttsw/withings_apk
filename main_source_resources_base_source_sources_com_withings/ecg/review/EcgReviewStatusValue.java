package com.withings.ecg.review;

import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EcgReviewStatus.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/ecg/review/EcgReviewStatusValue;", "", "ecg_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class EcgReviewStatusValue {

    /* renamed from: a  reason: collision with root package name */
    public static final EcgReviewStatusValue f38854a;

    /* renamed from: b  reason: collision with root package name */
    public static final EcgReviewStatusValue f38855b;

    /* renamed from: c  reason: collision with root package name */
    public static final EcgReviewStatusValue f38856c;

    /* renamed from: d  reason: collision with root package name */
    public static final EcgReviewStatusValue f38857d;

    /* renamed from: e  reason: collision with root package name */
    public static final EcgReviewStatusValue f38858e;

    /* renamed from: f  reason: collision with root package name */
    public static final EcgReviewStatusValue f38859f;

    /* renamed from: g  reason: collision with root package name */
    public static final EcgReviewStatusValue f38860g;

    /* renamed from: h  reason: collision with root package name */
    public static final EcgReviewStatusValue f38861h;

    /* renamed from: i  reason: collision with root package name */
    public static final EcgReviewStatusValue f38862i;

    /* renamed from: j  reason: collision with root package name */
    private static final /* synthetic */ EcgReviewStatusValue[] f38863j;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.ecg.review.EcgReviewStatusValue] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.ecg.review.EcgReviewStatusValue] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.ecg.review.EcgReviewStatusValue] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, com.withings.ecg.review.EcgReviewStatusValue] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, com.withings.ecg.review.EcgReviewStatusValue] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, com.withings.ecg.review.EcgReviewStatusValue] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, com.withings.ecg.review.EcgReviewStatusValue] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Enum, com.withings.ecg.review.EcgReviewStatusValue] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Enum, com.withings.ecg.review.EcgReviewStatusValue] */
    static {
        ?? r02 = new Enum("ERROR_UNKNOWN", 0);
        f38854a = r02;
        ?? r12 = new Enum("ERROR_USER_TOO_YOUNG", 1);
        f38855b = r12;
        ?? r22 = new Enum("ECG_NOT_ACTIVATED", 2);
        f38856c = r22;
        ?? r32 = new Enum("ERROR_REJECTED", 3);
        f38857d = r32;
        ?? r42 = new Enum("WAITING_FOR_APPROVAL", 4);
        f38858e = r42;
        ?? r52 = new Enum("NEED_AN_ECG_MEASUREMENT", 5);
        f38859f = r52;
        ?? r62 = new Enum("NEED_ANOTHER_ECG_MEASUREMENT", 6);
        f38860g = r62;
        ?? r7 = new Enum("NEED_SYNC_ECG_MEASUREMENT", 7);
        f38861h = r7;
        ?? r82 = new Enum("APPROVED", 8);
        f38862i = r82;
        EcgReviewStatusValue[] ecgReviewStatusValueArr = {r02, r12, r22, r32, r42, r52, r62, r7, r82};
        f38863j = ecgReviewStatusValueArr;
        b.a(ecgReviewStatusValueArr);
    }

    private EcgReviewStatusValue() {
        throw null;
    }

    public static EcgReviewStatusValue valueOf(String str) {
        return (EcgReviewStatusValue) Enum.valueOf(EcgReviewStatusValue.class, str);
    }

    public static EcgReviewStatusValue[] values() {
        return (EcgReviewStatusValue[]) f38863j.clone();
    }
}
