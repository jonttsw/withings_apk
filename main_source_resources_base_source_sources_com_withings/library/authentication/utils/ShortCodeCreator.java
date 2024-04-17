package com.withings.library.authentication.utils;

import cn0.c;
import en0.a;
import en0.i;
import en0.j;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.m;
/* compiled from: ShortCodeCreator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/withings/library/authentication/utils/ShortCodeCreator;", "", "()V", "Companion", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ShortCodeCreator {
    public static final Companion Companion = new Companion(null);
    private static final int MAX_LENGHT = 10;

    /* compiled from: ShortCodeCreator.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/utils/ShortCodeCreator$Companion;", "", "()V", "MAX_LENGHT", "", "createShortCode", "", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final String createShortCode() {
            ArrayList l02 = x.l0(new a('0', '9'), x.j0(new a('a', 'z'), new a('A', 'Z')));
            i iVar = new i(1, ShortCodeCreator.MAX_LENGHT, 1);
            ArrayList arrayList = new ArrayList(x.y(iVar, 10));
            j it = iVar.iterator();
            while (it.hasNext()) {
                it.a();
                Character ch2 = (Character) x.o0(l02, c.f23164a);
                ch2.getClass();
                arrayList.add(ch2);
            }
            return x.R(arrayList, "", null, null, null, 62);
        }

        private Companion() {
        }
    }
}
