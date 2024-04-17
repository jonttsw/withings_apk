package com.withings.contentproviders.eightfit.model.webservice;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.withings.contentproviders.model.content.TaskType;
import com.withings.learnmore.adapter.LearnMoreManager;
import com.withings.library.authentication.api.ConstantsWs;
import java.lang.reflect.Type;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import sm0.b;
/* compiled from: WsContentDeserializer.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\"\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/withings/contentproviders/eightfit/model/webservice/WsContentDeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lcom/withings/contentproviders/eightfit/model/webservice/WsContent;", "()V", "deserialize", LearnMoreManager.KEY_LEARN_MORE_JSON, "Lcom/google/gson/JsonElement;", "typeOfT", "Ljava/lang/reflect/Type;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Lcom/google/gson/JsonDeserializationContext;", "eightfit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WsContentDeserializer implements JsonDeserializer<WsContent> {
    public static final WsContentDeserializer INSTANCE = new WsContentDeserializer();

    /* compiled from: WsContentDeserializer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class EntriesMappings {
        public static final /* synthetic */ sm0.a<TaskType> entries$0 = b.a(TaskType.values());
    }

    private WsContentDeserializer() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.JsonDeserializer
    public WsContent deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) {
        WsContent wsContent;
        u.j(json, "json");
        u.j(typeOfT, "typeOfT");
        u.j(context, "context");
        Iterator<E> it = EntriesMappings.entries$0.iterator();
        do {
            wsContent = null;
            if (!it.hasNext()) {
                break;
            }
            TaskType taskType = (TaskType) it.next();
            JsonElement jsonElement = json.getAsJsonObject().get(TaskTypeExtensionKt.wsValue(taskType));
            if (jsonElement != null) {
                wsContent = (WsContent) context.deserialize(jsonElement, WsContentDeserializerKt.access$associatedWsClass(taskType));
                continue;
            }
        } while (wsContent == null);
        return wsContent;
    }
}
