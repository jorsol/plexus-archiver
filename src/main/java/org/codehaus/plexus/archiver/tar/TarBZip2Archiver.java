/**
 *
 * Copyright 2004 The Apache Software Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.codehaus.plexus.archiver.tar;

import javax.inject.Named;

/**
 * Create tar with bzip2 compression.
 *
 * @since 4.7.0
 */
@Named( "tar.bz2" )
public class TarBZip2Archiver
    extends TarArchiver
{

    public TarBZip2Archiver()
    {
        this.setupCompressionMethod();
    }

    private void setupCompressionMethod()
    {
        this.setCompression( TarCompressionMethod.bzip2 );
    }

}
