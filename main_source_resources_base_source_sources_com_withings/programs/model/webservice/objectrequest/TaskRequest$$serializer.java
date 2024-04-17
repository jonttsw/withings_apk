package com.withings.programs.model.webservice.objectrequest;

import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
/* compiled from: TaskRequest.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"com/withings/programs/model/webservice/objectrequest/TaskRequest.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/withings/programs/model/webservice/objectrequest/TaskRequest;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/withings/programs/model/webservice/objectrequest/TaskRequest;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lnm0/y;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/withings/programs/model/webservice/objectrequest/TaskRequest;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class TaskRequest$$serializer implements GeneratedSerializer<TaskRequest> {
    public static final TaskRequest$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        TaskRequest$$serializer taskRequest$$serializer = new TaskRequest$$serializer();
        INSTANCE = taskRequest$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.withings.programs.model.webservice.objectrequest.TaskRequest", taskRequest$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("task_identifier", false);
        pluginGeneratedSerialDescriptor.addElement("timestamp", false);
        pluginGeneratedSerialDescriptor.addElement("instanceid", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private TaskRequest$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{StringSerializer.INSTANCE, LongSerializer.INSTANCE, BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public TaskRequest deserialize(Decoder decoder) {
        String str;
        int i11;
        long j5;
        Integer num;
        u.j(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        if (beginStructure.decodeSequentially()) {
            String decodeStringElement = beginStructure.decodeStringElement(descriptor2, 0);
            long decodeLongElement = beginStructure.decodeLongElement(descriptor2, 1);
            str = decodeStringElement;
            num = (Integer) beginStructure.decodeNullableSerializableElement(descriptor2, 2, IntSerializer.INSTANCE, null);
            j5 = decodeLongElement;
            i11 = 7;
        } else {
            long j11 = 0;
            boolean z5 = true;
            String str2 = null;
            Integer num2 = null;
            int i12 = 0;
            while (z5) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                if (decodeElementIndex == -1) {
                    z5 = false;
                } else if (decodeElementIndex == 0) {
                    str2 = beginStructure.decodeStringElement(descriptor2, 0);
                    i12 |= 1;
                } else if (decodeElementIndex == 1) {
                    j11 = beginStructure.decodeLongElement(descriptor2, 1);
                    i12 |= 2;
                } else if (decodeElementIndex != 2) {
                    throw new UnknownFieldException(decodeElementIndex);
                } else {
                    num2 = (Integer) beginStructure.decodeNullableSerializableElement(descriptor2, 2, IntSerializer.INSTANCE, num2);
                    i12 |= 4;
                }
            }
            str = str2;
            i11 = i12;
            j5 = j11;
            num = num2;
        }
        beginStructure.endStructure(descriptor2);
        return new TaskRequest(i11, str, j5, num, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, TaskRequest value) {
        u.j(encoder, "encoder");
        u.j(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        TaskRequest.write$Self$android_release(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
