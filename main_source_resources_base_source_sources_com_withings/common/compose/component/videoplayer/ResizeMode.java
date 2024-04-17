package com.withings.common.compose.component.videoplayer;

import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoPlayerComponent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/common/compose/component/videoplayer/ResizeMode;", "", "remedy_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class ResizeMode {

    /* renamed from: a  reason: collision with root package name */
    public static final ResizeMode f34884a;

    /* renamed from: b  reason: collision with root package name */
    public static final ResizeMode f34885b;

    /* renamed from: c  reason: collision with root package name */
    private static final /* synthetic */ ResizeMode[] f34886c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.common.compose.component.videoplayer.ResizeMode] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.common.compose.component.videoplayer.ResizeMode] */
    static {
        ?? r02 = new Enum("Fit", 0);
        f34884a = r02;
        ?? r12 = new Enum("Zoom", 1);
        f34885b = r12;
        ResizeMode[] resizeModeArr = {r02, r12};
        f34886c = resizeModeArr;
        b.a(resizeModeArr);
    }

    private ResizeMode() {
        throw null;
    }

    public static ResizeMode valueOf(String str) {
        return (ResizeMode) Enum.valueOf(ResizeMode.class, str);
    }

    public static ResizeMode[] values() {
        return (ResizeMode[]) f34886c.clone();
    }
}
