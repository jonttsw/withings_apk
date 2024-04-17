package com.withings.common.compose.component;

import com.withings.wiscale2.C1987R;
/* compiled from: TopAppBar.kt */
/* loaded from: classes3.dex */
public abstract class a3 {

    /* renamed from: a  reason: collision with root package name */
    private final ym0.a<nm0.y> f33370a;

    /* compiled from: TopAppBar.kt */
    /* loaded from: classes3.dex */
    public static final class a extends a3 {

        /* renamed from: b  reason: collision with root package name */
        private final l2 f33371b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l2 l2Var, ym0.a<nm0.y> onClick) {
            super(onClick);
            kotlin.jvm.internal.u.j(onClick, "onClick");
            this.f33371b = l2Var;
        }

        public final l2 b() {
            return this.f33371b;
        }
    }

    /* compiled from: TopAppBar.kt */
    /* loaded from: classes3.dex */
    public static final class b extends a3 {

        /* renamed from: b  reason: collision with root package name */
        private final int f33372b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ym0.a onClick) {
            super(onClick);
            kotlin.jvm.internal.u.j(onClick, "onClick");
            this.f33372b = C1987R.string._CANCEL_;
        }

        public final int b() {
            return this.f33372b;
        }
    }

    private a3() {
        throw null;
    }

    public a3(ym0.a aVar) {
        this.f33370a = aVar;
    }

    public final ym0.a<nm0.y> a() {
        return this.f33370a;
    }
}
