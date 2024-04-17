package com.withings.healthscore.ui.composable;

import kotlin.Metadata;
import sm0.b;
/* compiled from: HISBlurredCircles.kt */
/* loaded from: classes3.dex */
final class Circle {

    /* renamed from: a  reason: collision with root package name */
    private final Size f40503a;

    /* renamed from: b  reason: collision with root package name */
    private final int f40504b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: HISBlurredCircles.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/healthscore/ui/composable/Circle$Size;", "", "ui_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final class Size {

        /* renamed from: b  reason: collision with root package name */
        public static final Size f40505b;

        /* renamed from: c  reason: collision with root package name */
        public static final Size f40506c;

        /* renamed from: d  reason: collision with root package name */
        public static final Size f40507d;

        /* renamed from: e  reason: collision with root package name */
        private static final /* synthetic */ Size[] f40508e;

        /* renamed from: a  reason: collision with root package name */
        private final float f40509a;

        static {
            Size size = new Size(20, 0, "Small");
            f40505b = size;
            Size size2 = new Size(28, 1, "Medium");
            f40506c = size2;
            Size size3 = new Size(36, 2, "Big");
            f40507d = size3;
            Size[] sizeArr = {size, size2, size3};
            f40508e = sizeArr;
            b.a(sizeArr);
        }

        private Size(float f11, int i11, String str) {
            this.f40509a = f11;
        }

        public static Size valueOf(String str) {
            return (Size) Enum.valueOf(Size.class, str);
        }

        public static Size[] values() {
            return (Size[]) f40508e.clone();
        }

        public final float a() {
            return this.f40509a;
        }
    }

    public Circle(Size size, int i11) {
        this.f40503a = size;
        this.f40504b = i11;
    }

    public final int a() {
        return this.f40504b;
    }

    public final Size b() {
        return this.f40503a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Circle)) {
            return false;
        }
        Circle circle = (Circle) obj;
        if (this.f40503a == circle.f40503a && this.f40504b == circle.f40504b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f40504b) + (this.f40503a.hashCode() * 31);
    }

    public final String toString() {
        return "Circle(size=" + this.f40503a + ", color=" + this.f40504b + ")";
    }
}
