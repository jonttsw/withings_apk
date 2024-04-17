package com.withings.alarm.model;

import com.withings.wiscale2.C1987R;
/* loaded from: classes3.dex */
public abstract class WsdProgramElement {

    /* renamed from: a  reason: collision with root package name */
    protected CategoryType f31089a;

    /* renamed from: b  reason: collision with root package name */
    protected int f31090b;

    /* loaded from: classes3.dex */
    public enum CategoryType {
        WEBRADIO(C1987R.string._WEBRADIOS_CATEGORY_TITLE_),
        SPOTIFY(C1987R.string._SPOTIFY_),
        WITHINGS(C1987R.string._WITHINGS_PROGRAM_NAME_);
        

        /* renamed from: a  reason: collision with root package name */
        private final int f31095a;

        CategoryType(int i11) {
            this.f31095a = i11;
        }

        public final int a() {
            return this.f31095a;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public WsdProgramElement(int i11) {
        this.f31090b = i11;
    }

    public final CategoryType a() {
        return this.f31089a;
    }

    public final int b() {
        return this.f31090b;
    }
}
