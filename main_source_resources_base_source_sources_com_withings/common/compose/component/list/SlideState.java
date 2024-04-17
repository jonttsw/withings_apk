package com.withings.common.compose.component.list;

import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Drag.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/common/compose/component/list/SlideState;", "", "remedy_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class SlideState {

    /* renamed from: a  reason: collision with root package name */
    public static final SlideState f34050a;

    /* renamed from: b  reason: collision with root package name */
    public static final SlideState f34051b;

    /* renamed from: c  reason: collision with root package name */
    public static final SlideState f34052c;

    /* renamed from: d  reason: collision with root package name */
    private static final /* synthetic */ SlideState[] f34053d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.common.compose.component.list.SlideState] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.common.compose.component.list.SlideState] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.common.compose.component.list.SlideState] */
    static {
        ?? r02 = new Enum("NONE", 0);
        f34050a = r02;
        ?? r12 = new Enum("UP", 1);
        f34051b = r12;
        ?? r22 = new Enum("DOWN", 2);
        f34052c = r22;
        SlideState[] slideStateArr = {r02, r12, r22};
        f34053d = slideStateArr;
        b.a(slideStateArr);
    }

    private SlideState() {
        throw null;
    }

    public static SlideState valueOf(String str) {
        return (SlideState) Enum.valueOf(SlideState.class, str);
    }

    public static SlideState[] values() {
        return (SlideState[]) f34053d.clone();
    }
}
