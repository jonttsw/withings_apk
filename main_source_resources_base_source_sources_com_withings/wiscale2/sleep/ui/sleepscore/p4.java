package com.withings.wiscale2.sleep.ui.sleepscore;
/* compiled from: SleepDayViewModel.kt */
/* loaded from: classes5.dex */
public abstract class p4 {

    /* compiled from: SleepDayViewModel.kt */
    /* loaded from: classes5.dex */
    public static final class a extends p4 {

        /* renamed from: a  reason: collision with root package name */
        private final di0.a f61191a;

        public a(di0.a aVar) {
            super(0);
            this.f61191a = aVar;
        }

        public final di0.a a() {
            return this.f61191a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && kotlin.jvm.internal.u.e(this.f61191a, ((a) obj).f61191a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f61191a.hashCode();
        }

        public final String toString() {
            return "Data(sleepData=" + this.f61191a + ")";
        }
    }

    /* compiled from: SleepDayViewModel.kt */
    /* loaded from: classes5.dex */
    public static final class b extends p4 {

        /* renamed from: a  reason: collision with root package name */
        public static final b f61192a = new p4(0);
    }

    public /* synthetic */ p4(int i11) {
        this();
    }

    private p4() {
    }
}
