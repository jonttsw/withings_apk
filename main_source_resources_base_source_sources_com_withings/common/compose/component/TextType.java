package com.withings.common.compose.component;

import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Range.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/common/compose/component/TextType;", "", "remedy_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class TextType {

    /* renamed from: a  reason: collision with root package name */
    private static final /* synthetic */ TextType[] f33344a;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.common.compose.component.TextType, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.withings.common.compose.component.TextType, java.lang.Enum] */
    static {
        TextType[] textTypeArr = {new Enum("Split", 0), new Enum("Selection", 1)};
        f33344a = textTypeArr;
        sm0.b.a(textTypeArr);
    }

    private TextType() {
        throw null;
    }

    public static TextType valueOf(String str) {
        return (TextType) Enum.valueOf(TextType.class, str);
    }

    public static TextType[] values() {
        return (TextType[]) f33344a.clone();
    }
}
