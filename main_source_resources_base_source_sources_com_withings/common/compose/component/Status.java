package com.withings.common.compose.component;

import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
/* compiled from: Status.kt */
/* loaded from: classes3.dex */
public final class Status {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Status.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/common/compose/component/Status$Icon;", "", "remedy_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final class Icon {

        /* renamed from: a  reason: collision with root package name */
        public static final Icon f33327a;

        /* renamed from: b  reason: collision with root package name */
        public static final Icon f33328b;

        /* renamed from: c  reason: collision with root package name */
        public static final Icon f33329c;

        /* renamed from: d  reason: collision with root package name */
        public static final Icon f33330d;

        /* renamed from: e  reason: collision with root package name */
        public static final Icon f33331e;

        /* renamed from: f  reason: collision with root package name */
        public static final Icon f33332f;

        /* renamed from: g  reason: collision with root package name */
        public static final Icon f33333g;

        /* renamed from: h  reason: collision with root package name */
        public static final Icon f33334h;

        /* renamed from: i  reason: collision with root package name */
        private static final /* synthetic */ Icon[] f33335i;

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.common.compose.component.Status$Icon] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.common.compose.component.Status$Icon] */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.common.compose.component.Status$Icon] */
        /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, com.withings.common.compose.component.Status$Icon] */
        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, com.withings.common.compose.component.Status$Icon] */
        /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, com.withings.common.compose.component.Status$Icon] */
        /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, com.withings.common.compose.component.Status$Icon] */
        /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Enum, com.withings.common.compose.component.Status$Icon] */
        static {
            ?? r02 = new Enum("Good", 0);
            f33327a = r02;
            ?? r12 = new Enum("Moderate", 1);
            f33328b = r12;
            ?? r22 = new Enum("Bad", 2);
            f33329c = r22;
            ?? r32 = new Enum("Undefined", 3);
            f33330d = r32;
            ?? r42 = new Enum("TrendUp", 4);
            f33331e = r42;
            ?? r52 = new Enum("TrendStable", 5);
            f33332f = r52;
            ?? r62 = new Enum("TrendDown", 6);
            f33333g = r62;
            ?? r7 = new Enum("Pending", 7);
            f33334h = r7;
            Icon[] iconArr = {r02, r12, r22, r32, r42, r52, r62, r7};
            f33335i = iconArr;
            sm0.b.a(iconArr);
        }

        private Icon() {
            throw null;
        }

        public static Icon valueOf(String str) {
            return (Icon) Enum.valueOf(Icon.class, str);
        }

        public static Icon[] values() {
            return (Icon[]) f33335i.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Status.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/common/compose/component/Status$Size;", "", "remedy_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final class Size {

        /* renamed from: a  reason: collision with root package name */
        public static final Size f33336a;

        /* renamed from: b  reason: collision with root package name */
        public static final Size f33337b;

        /* renamed from: c  reason: collision with root package name */
        public static final Size f33338c;

        /* renamed from: d  reason: collision with root package name */
        private static final /* synthetic */ Size[] f33339d;

        /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.common.compose.component.Status$Size, java.lang.Enum] */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.withings.common.compose.component.Status$Size, java.lang.Enum] */
        /* JADX WARN: Type inference failed for: r2v2, types: [com.withings.common.compose.component.Status$Size, java.lang.Enum] */
        static {
            ?? r02 = new Enum("Small", 0);
            f33336a = r02;
            ?? r12 = new Enum("Medium", 1);
            f33337b = r12;
            ?? r22 = new Enum("Large", 2);
            f33338c = r22;
            Size[] sizeArr = {r02, r12, r22};
            f33339d = sizeArr;
            sm0.b.a(sizeArr);
        }

        private Size() {
            throw null;
        }

        public static Size valueOf(String str) {
            return (Size) Enum.valueOf(Size.class, str);
        }

        public static Size[] values() {
            return (Size[]) f33339d.clone();
        }
    }

    public static int a(Icon icon) {
        switch (icon.ordinal()) {
            case 0:
                return C1987R.drawable.status_good;
            case 1:
                return C1987R.drawable.status_moderate;
            case 2:
                return C1987R.drawable.status_bad;
            case 3:
                return C1987R.drawable.status_undefined;
            case 4:
                return C1987R.drawable.status_trend_up;
            case 5:
                return C1987R.drawable.status_trend_stable;
            case 6:
                return C1987R.drawable.status_trend_down;
            case 7:
                return C1987R.drawable.status_pending;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
