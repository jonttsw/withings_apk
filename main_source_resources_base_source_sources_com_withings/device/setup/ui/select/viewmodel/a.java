package com.withings.device.setup.ui.select.viewmodel;

import com.withings.device.setup.ui.select.uc.SetupDeviceCategory;
import kotlin.jvm.internal.u;
/* compiled from: SetupChooseDeviceViewModel.kt */
/* loaded from: classes3.dex */
public interface a {

    /* compiled from: SetupChooseDeviceViewModel.kt */
    /* renamed from: com.withings.device.setup.ui.select.viewmodel.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0493a implements a {

        /* renamed from: a  reason: collision with root package name */
        private final SetupDeviceCategory f37662a;

        public C0493a(SetupDeviceCategory category) {
            u.j(category, "category");
            this.f37662a = category;
        }

        public final SetupDeviceCategory a() {
            return this.f37662a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C0493a) && this.f37662a == ((C0493a) obj).f37662a) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f37662a.hashCode();
        }

        public final String toString() {
            return "SelectCategory(category=" + this.f37662a + ")";
        }
    }

    /* compiled from: SetupChooseDeviceViewModel.kt */
    /* loaded from: classes3.dex */
    public static final class b implements a {

        /* renamed from: a  reason: collision with root package name */
        private final rp.b f37663a;

        public b(rp.b bVar) {
            this.f37663a = bVar;
        }

        public final rp.b a() {
            return this.f37663a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && u.e(this.f37663a, ((b) obj).f37663a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f37663a.hashCode();
        }

        public final String toString() {
            return "SelectModel(model=" + this.f37663a + ")";
        }
    }

    /* compiled from: SetupChooseDeviceViewModel.kt */
    /* loaded from: classes3.dex */
    public static final class c implements a {

        /* renamed from: a  reason: collision with root package name */
        private final rp.b f37664a;

        public c(rp.b model) {
            u.j(model, "model");
            this.f37664a = model;
        }

        public final rp.b a() {
            return this.f37664a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && u.e(this.f37664a, ((c) obj).f37664a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f37664a.hashCode();
        }

        public final String toString() {
            return "StartDownloadResources(model=" + this.f37664a + ")";
        }
    }
}
