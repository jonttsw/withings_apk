package com.withings.webradio.network;

import android.location.Location;
import androidx.activity.a0;
import androidx.compose.material.g6;
import com.withings.account.network.ws.RetrofitAccountRemoteRepository;
import com.withings.manualLogging.data.webservice.healthAttribute.GetHealthAttributeResponse;
import com.withings.webradio.WebRadios;
import com.withings.webradio.model.WebRadio;
import com.withings.webradio.model.WebRadioCategory;
import com.withings.webradio.model.WebRadioNode;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.i0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import vh.m;
import x70.b;
/* compiled from: GetWebRadios.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B3\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/withings/webradio/network/GetWebRadios;", "Lvh/m;", "", "Lcom/withings/webradio/model/WebRadio;", "", "pathUrl", "()Ljava/lang/String;", RetrofitAccountRemoteRepository.CHANNEL_CALL, "()Ljava/util/List;", "Lcom/withings/webradio/network/WebRadiosRemoteRepository;", "webRadiosRemoteRepository", "Lcom/withings/webradio/network/WebRadiosRemoteRepository;", "Lcom/withings/webradio/model/WebRadioCategory;", "category", "Lcom/withings/webradio/model/WebRadioCategory;", "Lcom/withings/webradio/model/WebRadioNode;", "node", "Lcom/withings/webradio/model/WebRadioNode;", "Landroid/location/Location;", "lastKnownLocation", "Landroid/location/Location;", "", GetHealthAttributeResponse.FIELD_OFFSET_NAME, "I", "count", "<init>", "(Lcom/withings/webradio/network/WebRadiosRemoteRepository;Lcom/withings/webradio/model/WebRadioCategory;Lcom/withings/webradio/model/WebRadioNode;Landroid/location/Location;I)V", "webradio_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class GetWebRadios implements m<List<? extends WebRadio>> {
    private final WebRadioCategory category;
    private final int count;
    private final Location lastKnownLocation;
    private final WebRadioNode node;
    private final int offset;
    private final WebRadiosRemoteRepository webRadiosRemoteRepository;

    /* compiled from: GetWebRadios.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WebRadioCategory.values().length];
            try {
                iArr[WebRadioCategory.Trending.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WebRadioCategory.Sports.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WebRadioCategory.LocalRadio.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WebRadioCategory.Language.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[WebRadioCategory.Music.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[WebRadioCategory.Country.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[WebRadioCategory.News.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[WebRadioCategory.Genres.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[WebRadioCategory.Talk.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[WebRadioCategory.Ambient.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[WebRadioCategory.Mediative.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[WebRadioCategory.Classical.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[WebRadioCategory.Search.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public GetWebRadios(WebRadiosRemoteRepository webRadiosRemoteRepository, WebRadioCategory category, WebRadioNode webRadioNode, Location location, int i11) {
        u.j(webRadiosRemoteRepository, "webRadiosRemoteRepository");
        u.j(category, "category");
        this.webRadiosRemoteRepository = webRadiosRemoteRepository;
        this.category = category;
        this.node = webRadioNode;
        this.lastKnownLocation = location;
        this.offset = i11;
        this.count = 50;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x009f, code lost:
        if (r0 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ce, code lost:
        if (r0 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0053, code lost:
        if (r0 == null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String pathUrl() {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.webradio.network.GetWebRadios.pathUrl():java.lang.String");
    }

    @Override // vh.m
    public List<? extends WebRadio> call() {
        Object runBlocking$default;
        String i11 = g6.i(WebRadios.INSTANCE.getAirableBaseUrl(), "/radios/");
        String pathUrl = pathUrl();
        if (pathUrl == null) {
            return i0.f76187a;
        }
        String i12 = g6.i(i11, pathUrl);
        b.r(this, a0.b("Calling Airable with parameters : ", i12), new Object[0]);
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new GetWebRadios$call$1(this, i12, null), 1, null);
        return (List) runBlocking$default;
    }
}
