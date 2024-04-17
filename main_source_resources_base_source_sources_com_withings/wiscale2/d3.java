package com.withings.wiscale2;

import java.util.Iterator;
/* compiled from: ThemeHelper.kt */
/* loaded from: classes4.dex */
public final class d3 {
    public static final int a() {
        Object obj;
        Iterator<E> it = Theme.a().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((Theme) obj).d() == androidx.appcompat.app.f.j()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Theme theme = (Theme) obj;
        if (theme != null) {
            return theme.b();
        }
        return Theme.f47982d.b();
    }
}
