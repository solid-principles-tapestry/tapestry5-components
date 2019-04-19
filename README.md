# Components

Additional components for [Tapestry5 Framework](http://tapestry.apache.org/) version 5.4+

Components are registered under the `sp` library name.

## Localized formatting components
- OutputDate: `<t:sp.outputDate value="creationDate" />`
- OutputDateTime: `<t:sp.outputDateTime value="creationTime" />`
- OutputMoney: `<t:sp.outputMoney value="price" />`
- OutputPercent: `<t:sp.outputPercent value="vat" />`

# How to use it

Currently this library is not published to any Maven repos. 

- Clone/download the repository to your computer
- Publish it to your local maven repo: `gradle publishToMavenLocal`
- Add the library as a dependency to your project: `compile group: 'solid.principles', name: 'tapestry5-components', version: '0.0.1'`
- Add to your project's build.gradle the below to find the library in your local repo: 

```
repositories {
    mavenLocal()
}
```
