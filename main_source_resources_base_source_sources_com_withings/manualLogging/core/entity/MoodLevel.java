package com.withings.manualLogging.core.entity;

import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TemporaryMood.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/manualLogging/core/entity/MoodLevel;", "", "a", "manual-logging-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class MoodLevel {

    /* renamed from: b  reason: collision with root package name */
    public static final a f40656b;

    /* renamed from: c  reason: collision with root package name */
    public static final MoodLevel f40657c;

    /* renamed from: d  reason: collision with root package name */
    public static final MoodLevel f40658d;

    /* renamed from: e  reason: collision with root package name */
    public static final MoodLevel f40659e;

    /* renamed from: f  reason: collision with root package name */
    public static final MoodLevel f40660f;

    /* renamed from: g  reason: collision with root package name */
    public static final MoodLevel f40661g;

    /* renamed from: h  reason: collision with root package name */
    private static final /* synthetic */ MoodLevel[] f40662h;

    /* renamed from: a  reason: collision with root package name */
    private final int f40663a;

    /* compiled from: TemporaryMood.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        public static MoodLevel a(int i11) {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 == 4) {
                                return MoodLevel.f40661g;
                            }
                            throw new RuntimeException(android.support.v4.media.a.a("No known mood level for value ", i11));
                        }
                        return MoodLevel.f40660f;
                    }
                    return MoodLevel.f40659e;
                }
                return MoodLevel.f40658d;
            }
            return MoodLevel.f40657c;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.withings.manualLogging.core.entity.MoodLevel$a, java.lang.Object] */
    static {
        MoodLevel moodLevel = new MoodLevel("Unhappy", 0, 0);
        f40657c = moodLevel;
        MoodLevel moodLevel2 = new MoodLevel("Sad", 1, 1);
        f40658d = moodLevel2;
        MoodLevel moodLevel3 = new MoodLevel("Okay", 2, 2);
        f40659e = moodLevel3;
        MoodLevel moodLevel4 = new MoodLevel("Good", 3, 3);
        f40660f = moodLevel4;
        MoodLevel moodLevel5 = new MoodLevel("Happy", 4, 4);
        f40661g = moodLevel5;
        MoodLevel[] moodLevelArr = {moodLevel, moodLevel2, moodLevel3, moodLevel4, moodLevel5};
        f40662h = moodLevelArr;
        b.a(moodLevelArr);
        f40656b = new Object();
    }

    private MoodLevel(String str, int i11, int i12) {
        this.f40663a = i12;
    }

    public static MoodLevel valueOf(String str) {
        return (MoodLevel) Enum.valueOf(MoodLevel.class, str);
    }

    public static MoodLevel[] values() {
        return (MoodLevel[]) f40662h.clone();
    }

    public final int a() {
        return this.f40663a;
    }
}
