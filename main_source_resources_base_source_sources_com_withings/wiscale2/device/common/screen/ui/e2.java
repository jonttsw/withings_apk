package com.withings.wiscale2.device.common.screen.ui;

import android.content.DialogInterface;
import com.withings.wiscale2.sleep.ui.edition.NightEditionActivity;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class e2 implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f53289a;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i11) {
        switch (this.f53289a) {
            case 0:
                int i12 = g2.f53314h;
                dialogInterface.dismiss();
                return;
            default:
                NightEditionActivity.a aVar = NightEditionActivity.f60435u;
                dialogInterface.dismiss();
                return;
        }
    }
}
