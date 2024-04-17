package com.withings.screen.repository.data;

import com.withings.screen.repository.data.UpdateScreensStateAndOrder;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import ym0.l;
/* compiled from: UpdateScreensStateAndOrder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/withings/screen/repository/data/UpdateScreensStateAndOrder$ScreenState;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class UpdateScreensStateAndOrder$invoke$1$2 extends w implements l<UpdateScreensStateAndOrder.ScreenState, CharSequence> {
    public static final UpdateScreensStateAndOrder$invoke$1$2 INSTANCE = new UpdateScreensStateAndOrder$invoke$1$2();

    UpdateScreensStateAndOrder$invoke$1$2() {
        super(1);
    }

    @Override // ym0.l
    public final CharSequence invoke(UpdateScreensStateAndOrder.ScreenState it) {
        u.j(it, "it");
        return String.valueOf(it.getWsId());
    }
}
