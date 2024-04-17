package com.withings.tutorials.ui.screens;

import androidx.camera.core.y1;
import androidx.lifecycle.g1;
import javax.inject.Inject;
import kotlin.Metadata;
/* compiled from: SetupScaleForMultipleUsersViewModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/tutorials/ui/screens/SetupScaleForMultipleUsersViewModel;", "Landroidx/lifecycle/g1;", "a", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SetupScaleForMultipleUsersViewModel extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final com.withings.device.details.scale.b f44802a;

    /* renamed from: b  reason: collision with root package name */
    private final m70.i f44803b;

    /* renamed from: c  reason: collision with root package name */
    private final fy.o f44804c;

    /* renamed from: d  reason: collision with root package name */
    private final xw.n<a> f44805d;

    /* renamed from: e  reason: collision with root package name */
    private final xw.n<a> f44806e;

    /* compiled from: SetupScaleForMultipleUsersViewModel.kt */
    /* loaded from: classes4.dex */
    public static abstract class a {

        /* compiled from: SetupScaleForMultipleUsersViewModel.kt */
        /* renamed from: com.withings.tutorials.ui.screens.SetupScaleForMultipleUsersViewModel$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0620a extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final C0620a f44807a = new C0620a();

            private C0620a() {
                super(0);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0620a)) {
                    return false;
                }
                C0620a c0620a = (C0620a) obj;
                return true;
            }

            public final int hashCode() {
                return -1639977024;
            }

            public final String toString() {
                return "NewUserHasNoWeight";
            }
        }

        /* compiled from: SetupScaleForMultipleUsersViewModel.kt */
        /* loaded from: classes4.dex */
        public static final class b extends a {

            /* renamed from: a  reason: collision with root package name */
            private final String f44808a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String link) {
                super(0);
                kotlin.jvm.internal.u.j(link, "link");
                this.f44808a = link;
            }

            public final String a() {
                return this.f44808a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof b) && kotlin.jvm.internal.u.e(this.f44808a, ((b) obj).f44808a)) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                return this.f44808a.hashCode();
            }

            public final String toString() {
                return y1.e(new StringBuilder("ShareLink(link="), this.f44808a, ")");
            }
        }

        /* compiled from: SetupScaleForMultipleUsersViewModel.kt */
        /* loaded from: classes4.dex */
        public static final class c extends a {

            /* renamed from: a  reason: collision with root package name */
            private final Throwable f44809a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Throwable throwable) {
                super(0);
                kotlin.jvm.internal.u.j(throwable, "throwable");
                this.f44809a = throwable;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof c) && kotlin.jvm.internal.u.e(this.f44809a, ((c) obj).f44809a)) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                return this.f44809a.hashCode();
            }

            public final String toString() {
                return "ShareLinkError(throwable=" + this.f44809a + ")";
            }
        }

        /* compiled from: SetupScaleForMultipleUsersViewModel.kt */
        /* loaded from: classes4.dex */
        public static final class d extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final d f44810a = new d();

            private d() {
                super(0);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return true;
            }

            public final int hashCode() {
                return -1564643703;
            }

            public final String toString() {
                return "ShareLinkErrorNoInternet";
            }
        }

        /* compiled from: SetupScaleForMultipleUsersViewModel.kt */
        /* loaded from: classes4.dex */
        public static final class e extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final e f44811a = new e();

            private e() {
                super(0);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return true;
            }

            public final int hashCode() {
                return -1823335408;
            }

            public final String toString() {
                return "UserAddedIsABaby";
            }
        }

        public /* synthetic */ a(int i11) {
            this();
        }

        private a() {
        }
    }

    @Inject
    public SetupScaleForMultipleUsersViewModel(com.withings.device.details.scale.b generateShareScaleLinkUseCase, m70.i userManager, fy.o oVar) {
        kotlin.jvm.internal.u.j(generateShareScaleLinkUseCase, "generateShareScaleLinkUseCase");
        kotlin.jvm.internal.u.j(userManager, "userManager");
        this.f44802a = generateShareScaleLinkUseCase;
        this.f44803b = userManager;
        this.f44804c = oVar;
        xw.n<a> nVar = new xw.n<>();
        this.f44805d = nVar;
        this.f44806e = nVar;
    }

    public final xw.n<a> k0() {
        return this.f44806e;
    }
}
