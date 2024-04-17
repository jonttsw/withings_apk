package com.withings.webradio.network;

import com.withings.account.network.ws.RetrofitAccountRemoteRepository;
import com.withings.webradio.model.WebRadioNode;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import sm0.a;
import sm0.b;
import vh.m;
/* compiled from: GetWebRadioTree.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/withings/webradio/network/GetWebRadioTree;", "Lvh/m;", "Lcom/withings/webradio/model/WebRadioNode;", RetrofitAccountRemoteRepository.CHANNEL_CALL, "()Lcom/withings/webradio/model/WebRadioNode;", "Lcom/withings/webradio/network/GetWebRadioTree$WebRadioTreeType;", "webRadioTreeType", "Lcom/withings/webradio/network/GetWebRadioTree$WebRadioTreeType;", "getWebRadioTreeType", "()Lcom/withings/webradio/network/GetWebRadioTree$WebRadioTreeType;", "Lcom/withings/webradio/network/WebRadiosRemoteRepository;", "remoteRepository", "Lcom/withings/webradio/network/WebRadiosRemoteRepository;", "<init>", "(Lcom/withings/webradio/network/GetWebRadioTree$WebRadioTreeType;Lcom/withings/webradio/network/WebRadiosRemoteRepository;)V", "WebRadioTreeType", "webradio_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class GetWebRadioTree implements m<WebRadioNode> {
    private final WebRadiosRemoteRepository remoteRepository;
    private final WebRadioTreeType webRadioTreeType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GetWebRadioTree.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/withings/webradio/network/GetWebRadioTree$WebRadioTreeType;", "", "url", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "Genres", "Places", "Language", "webradio_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class WebRadioTreeType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ WebRadioTreeType[] $VALUES;
        private final String url;
        public static final WebRadioTreeType Genres = new WebRadioTreeType("Genres", 0, "/genres/tree");
        public static final WebRadioTreeType Places = new WebRadioTreeType("Places", 1, "/places/tree");
        public static final WebRadioTreeType Language = new WebRadioTreeType("Language", 2, "/languages");

        private static final /* synthetic */ WebRadioTreeType[] $values() {
            return new WebRadioTreeType[]{Genres, Places, Language};
        }

        static {
            WebRadioTreeType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private WebRadioTreeType(String str, int i11, String str2) {
            this.url = str2;
        }

        public static a<WebRadioTreeType> getEntries() {
            return $ENTRIES;
        }

        public static WebRadioTreeType valueOf(String str) {
            return (WebRadioTreeType) Enum.valueOf(WebRadioTreeType.class, str);
        }

        public static WebRadioTreeType[] values() {
            return (WebRadioTreeType[]) $VALUES.clone();
        }

        public final String getUrl() {
            return this.url;
        }
    }

    public GetWebRadioTree(WebRadioTreeType webRadioTreeType, WebRadiosRemoteRepository remoteRepository) {
        u.j(webRadioTreeType, "webRadioTreeType");
        u.j(remoteRepository, "remoteRepository");
        this.webRadioTreeType = webRadioTreeType;
        this.remoteRepository = remoteRepository;
    }

    public final WebRadioTreeType getWebRadioTreeType() {
        return this.webRadioTreeType;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // vh.m
    public WebRadioNode call() {
        Object runBlocking$default;
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new GetWebRadioTree$call$1(this, null), 1, null);
        return (WebRadioNode) runBlocking$default;
    }
}
