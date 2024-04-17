package com.withings.common.compose.component.card.stack;

import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CardDrawableShape.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/common/compose/component/card/stack/CardDrawableShape;", "", "remedy_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class CardDrawableShape {

    /* renamed from: a  reason: collision with root package name */
    public static final CardDrawableShape f33625a;

    /* renamed from: b  reason: collision with root package name */
    public static final CardDrawableShape f33626b;

    /* renamed from: c  reason: collision with root package name */
    private static final /* synthetic */ CardDrawableShape[] f33627c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.common.compose.component.card.stack.CardDrawableShape] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.common.compose.component.card.stack.CardDrawableShape] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.common.compose.component.card.stack.CardDrawableShape] */
    static {
        ?? r02 = new Enum("RoundedCorner", 0);
        f33625a = r02;
        ?? r12 = new Enum("Circle", 1);
        f33626b = r12;
        CardDrawableShape[] cardDrawableShapeArr = {r02, r12, new Enum("Custom", 2)};
        f33627c = cardDrawableShapeArr;
        b.a(cardDrawableShapeArr);
    }

    private CardDrawableShape() {
        throw null;
    }

    public static CardDrawableShape valueOf(String str) {
        return (CardDrawableShape) Enum.valueOf(CardDrawableShape.class, str);
    }

    public static CardDrawableShape[] values() {
        return (CardDrawableShape[]) f33627c.clone();
    }
}
