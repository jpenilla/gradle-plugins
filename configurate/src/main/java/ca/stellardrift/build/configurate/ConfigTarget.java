/*
 * Copyright 2020 zml
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ca.stellardrift.build.configurate;

import org.spongepowered.configurate.ConfigurateException;
import org.spongepowered.configurate.ConfigurationNode;

import java.io.Writer;

/**
 * A receiver of a configuration node, the other half of the loader.
 */
public interface ConfigTarget {
    /**
     * Write the contents of {@code node} to the {@code destination} writer.
     *
     * @param destination target to write to
     * @param node source node
     * @throws ConfigurateException if any part of the node could not be written
     */
    void write(final Writer destination, final ConfigurationNode node) throws ConfigurateException;
}
