# Components

## Localized formatting components
- OutputDate: `<t:sp.outputDate value="creationDate" />`
- OutputDateTime: `<t:sp.outputDateTime value="creationTime" />`
- OutputMoney: `<t:sp.outputMoney value="price" />`
- OutputPercent: `<t:sp.outputPercent value="vat" />`

# How to use it

Currently this library is not published to any Maven repos. 

- Clone/download the repository to your computer
- Deploy it to your local maven repo: `gradle install`
- Add the library as a dependency to your project: `compile group: 'solid.principles', name: 'tapestry5-components', version: '0.0.1'`
- Add to your project's build.gradle the below to find the library in your local repo: 

```
repositories {
    mavenLocal()
}
```
