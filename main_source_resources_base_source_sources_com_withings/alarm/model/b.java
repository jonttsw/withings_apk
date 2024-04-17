package com.withings.alarm.model;

import android.content.Context;
import com.withings.alarm.model.WsdProgramElement;
import com.withings.util.log.Fail;
import com.withings.wiscale2.C1987R;
/* compiled from: WsdProgramHolder.java */
/* loaded from: classes3.dex */
public final class b extends WsdProgramElement {

    /* renamed from: c  reason: collision with root package name */
    private WsdProgram f31097c;

    public b(WsdProgramElement.CategoryType categoryType, WsdProgram wsdProgram) {
        super(1);
        this.f31089a = categoryType;
        this.f31097c = wsdProgram;
    }

    public final String c(Context context) {
        int ordinal = this.f31089a.ordinal();
        WsdProgram wsdProgram = this.f31097c;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    return null;
                }
                Fail.h(wsdProgram, "WsdProgram is null and category type is " + WsdProgramElement.CategoryType.WITHINGS);
                return wsdProgram.f(context);
            } else if (wsdProgram != null && wsdProgram.o()) {
                return wsdProgram.h();
            } else {
                return context.getString(C1987R.string._SPOTIFY_ADD_PLAYLIST_);
            }
        } else if (wsdProgram != null && wsdProgram.p()) {
            if (wsdProgram.k() != null) {
                return wsdProgram.k();
            }
            return wsdProgram.j();
        } else {
            return context.getString(C1987R.string._WEBRADIO_ADD_);
        }
    }

    public final WsdProgram d() {
        return this.f31097c;
    }
}
