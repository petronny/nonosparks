import json
example='04'
data={}
data['width']=3
data['height']=1
data['hints']={}
data['hints']['vertical']=['3']
data['answer']=[]
data['answer'].append([1,1,1])
json.dump(data,open('examples/'+example+'.json','w'))
