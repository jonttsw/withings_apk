package com.withings.wiscale2.device.common.screen.ui;

import java.util.List;
/* compiled from: ScreenSelectionViewModel.kt */
/* loaded from: classes5.dex */
public interface y1 {

    /* compiled from: ScreenSelectionViewModel.kt */
    /* loaded from: classes5.dex */
    public static final class a implements y1 {

        /* renamed from: a  reason: collision with root package name */
        private final List<sc0.c> f53483a;

        /* renamed from: b  reason: collision with root package name */
        private final List<sc0.c> f53484b;

        public a(List<sc0.c> activeScreensPerCategories, List<sc0.c> inactiveScreensPerCategories) {
            kotlin.jvm.internal.u.j(activeScreensPerCategories, "activeScreensPerCategories");
            kotlin.jvm.internal.u.j(inactiveScreensPerCategories, "inactiveScreensPerCategories");
            this.f53483a = activeScreensPerCategories;
            this.f53484b = inactiveScreensPerCategories;
        }

        public final List<sc0.c> a() {
            return this.f53483a;
        }

        public final List<sc0.c> b() {
            return this.f53484b;
        }
    }

    /* compiled from: ScreenSelectionViewModel.kt */
    /* loaded from: classes5.dex */
    public static final class b implements y1 {

        /* renamed from: a  reason: collision with root package name */
        private final List<sc0.b> f53485a;

        /* renamed from: b  reason: collision with root package name */
        private final List<sc0.b> f53486b;

        public b(List<sc0.b> list, List<sc0.b> list2) {
            this.f53485a = list;
            this.f53486b = list2;
        }

        public final List<sc0.b> a() {
            return this.f53485a;
        }

        public final List<sc0.b> b() {
            return this.f53486b;
        }
    }

    /* compiled from: ScreenSelectionViewModel.kt */
    /* loaded from: classes5.dex */
    public static final class c implements y1 {

        /* renamed from: a  reason: collision with root package name */
        public static final c f53487a = new Object();
    }

    /* compiled from: ScreenSelectionViewModel.kt */
    /* loaded from: classes5.dex */
    public static final class d implements y1 {

        /* renamed from: a  reason: collision with root package name */
        private final List<sc0.c> f53488a;

        public d(List<sc0.c> screensPerCategories) {
            kotlin.jvm.internal.u.j(screensPerCategories, "screensPerCategories");
            this.f53488a = screensPerCategories;
        }

        public final List<sc0.c> a() {
            return this.f53488a;
        }
    }
}
