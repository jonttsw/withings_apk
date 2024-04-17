package com.withings.common.compose.component.card;

import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FeedbackCard.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/withings/common/compose/component/card/FeedbackCard$Status", "", "Lcom/withings/common/compose/component/card/FeedbackCard$Status;", "remedy_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FeedbackCard$Status {

    /* renamed from: a  reason: collision with root package name */
    public static final FeedbackCard$Status f33622a;

    /* renamed from: b  reason: collision with root package name */
    public static final FeedbackCard$Status f33623b;

    /* renamed from: c  reason: collision with root package name */
    private static final /* synthetic */ FeedbackCard$Status[] f33624c;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.common.compose.component.card.FeedbackCard$Status, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.withings.common.compose.component.card.FeedbackCard$Status, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.withings.common.compose.component.card.FeedbackCard$Status, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.withings.common.compose.component.card.FeedbackCard$Status, java.lang.Enum] */
    static {
        ?? r02 = new Enum("Info", 0);
        f33622a = r02;
        ?? r12 = new Enum("Good", 1);
        ?? r22 = new Enum("Moderate", 2);
        ?? r32 = new Enum("Bad", 3);
        f33623b = r32;
        FeedbackCard$Status[] feedbackCard$StatusArr = {r02, r12, r22, r32};
        f33624c = feedbackCard$StatusArr;
        b.a(feedbackCard$StatusArr);
    }

    private FeedbackCard$Status() {
        throw null;
    }

    public static FeedbackCard$Status valueOf(String str) {
        return (FeedbackCard$Status) Enum.valueOf(FeedbackCard$Status.class, str);
    }

    public static FeedbackCard$Status[] values() {
        return (FeedbackCard$Status[]) f33624c.clone();
    }
}
