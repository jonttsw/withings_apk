package com.withings.common.compose.component.card.stack;

import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CardTextSize.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/common/compose/component/card/stack/CardTextSize;", "", "remedy_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class CardTextSize {

    /* renamed from: a  reason: collision with root package name */
    public static final CardTextSize f33628a;

    /* renamed from: b  reason: collision with root package name */
    public static final CardTextSize f33629b;

    /* renamed from: c  reason: collision with root package name */
    private static final /* synthetic */ CardTextSize[] f33630c;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.common.compose.component.card.stack.CardTextSize, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.withings.common.compose.component.card.stack.CardTextSize, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.withings.common.compose.component.card.stack.CardTextSize, java.lang.Enum] */
    static {
        ?? r02 = new Enum("Small", 0);
        f33628a = r02;
        ?? r12 = new Enum("Standard", 1);
        f33629b = r12;
        CardTextSize[] cardTextSizeArr = {r02, r12, new Enum("Long", 2)};
        f33630c = cardTextSizeArr;
        b.a(cardTextSizeArr);
    }

    private CardTextSize() {
        throw null;
    }

    public static CardTextSize valueOf(String str) {
        return (CardTextSize) Enum.valueOf(CardTextSize.class, str);
    }

    public static CardTextSize[] values() {
        return (CardTextSize[]) f33630c.clone();
    }
}
